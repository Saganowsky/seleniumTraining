package kfm;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExistanceOfElement {


    @Test
    public void checkIfElementExists() {


        WebDriver driver = new FirefoxDriver();
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");
        elementAvailable(By.xpath("//*[@id=\"smileImage\"]"), driver);
        elementAvailibility(By.xpath("//*[@id=\"smileImage\"]"), driver);

    }

    public static boolean elementAvailable(By locator, WebDriver driver) {

        if (driver.findElements(locator).size() > 0) {

            System.out.println("Element's present");

            return true;

        } else {
            System.out.println("There's no such element");

            return false;
        }
    }

    public static void elementAvailibility(By locator, WebDriver driver) {

        try {

            driver.findElement(locator);
            System.out.println("Element's present");
        } catch (NoSuchElementException exc) {
            System.out.println("No such element found");


        }

    }
}
