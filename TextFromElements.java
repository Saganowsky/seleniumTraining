package kfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextFromElements {

    @Test
    public void getTextFromElements(){


        WebDriver driver = new FirefoxDriver();
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");

        WebElement firstNameInput = driver.findElement(By.name("fname"));

        firstNameInput.isEnabled();
        System.out.println(firstNameInput.isEnabled());
        firstNameInput.sendKeys("Jakub");
        firstNameInput.getAttribute("value");
        System.out.println(firstNameInput.getAttribute("value"));

        WebElement hiddenParagraph = driver.findElement(By.className("topSecret"));
        hiddenParagraph.getAttribute("textContent");
        System.out.println(hiddenParagraph.getAttribute("textContent"));
    }
}
