package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {


        public static final String SEARCHFIELD = "_nkw";
        public static void main(String[] args) {
            WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);  // [1]
            driver.get("https://www.ebay.com/");                                   // [2]
            WebElement searchField = driver.findElement(By.name(SEARCHFIELD));      // [4]
            searchField.sendKeys("Laptop");
            searchField.submit();

    }

}
