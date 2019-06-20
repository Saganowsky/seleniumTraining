package kfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class acceptingAlerts {


    @Test
    public void alertPage() {

        WebDriver driver = new FirefoxDriver();
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");
        WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));
        alertButton.click();
        driver.switchTo().alert().accept();
        alertButton.click();
        driver.switchTo().alert().dismiss();


    }
}
