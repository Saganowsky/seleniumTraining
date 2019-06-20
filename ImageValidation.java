package kfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImageValidation {

    @Test

    public void validateImage(){

        WebDriver driver = new FirefoxDriver();
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");

        WebElement locateImage = driver.findElement(By.id("smileImage"));
        locateImage.getAttribute("naturalHeight");
        System.out.println(locateImage.getAttribute("naturalHeight"));
        System.out.println(locateImage.getAttribute("naturalWidth"));
        System.out.println(locateImage.getSize().getHeight());
        System.out.println(locateImage.getSize().getWidth());



    }
}
