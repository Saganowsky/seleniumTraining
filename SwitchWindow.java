package kfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.locks.Condition;

public class SwitchWindow {


    @Test
    public void googleOpenTest() {


        WebDriver driver = new FirefoxDriver(); // Open Browser
        WebDriverWait wait = new WebDriverWait(driver, 30);

        // ENTER MAIN PAGE
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");
        WebElement newPageButton = driver.findElement(By.id("newPage"));
        newPageButton.click();
        String currentWindowName = driver.getWindowHandle();
        switchToNewWindow(driver, currentWindowName);
        wait.until(ExpectedConditions.titleIs("Google"));
        System.out.println(driver.getCurrentUrl());
        System.out.println("Tytul strony to " + driver.getTitle()); // pobiera tytuł strony testowej
        driver.switchTo().window(currentWindowName);
        System.out.println(driver.getCurrentUrl());
        System.out.println("Tytul strony to " + driver.getTitle()); // pobiera tytuł strony testowej


    }

    private void switchToNewWindow(WebDriver driver, String currentWindowName){
        Set <String> allAvailableWindows = driver.getWindowHandles();

        for(String singleWindow : allAvailableWindows){


            if(!singleWindow.equals(currentWindowName)){

                driver.switchTo().window(singleWindow);
            }
        }




    }
}
