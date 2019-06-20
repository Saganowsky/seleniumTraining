package kfm;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectDropdown {

    @Test
    public void carSelectDropdown() {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.get("file:/Users/mac/Desktop/SeleniumCourseData/Test.html");

        Select carSelect = new Select(driver.findElement(By.cssSelector("select")));
        carSelect.selectByIndex(2);









    }
}
