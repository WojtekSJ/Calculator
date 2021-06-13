package com.kodilla.testing2.facebook;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {
    public static final String XPATH_AcceptAll = "//button[2]";
    public static final String Name = "Utwórz nowe konto";
    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAIT_FOR  = "//select[1]";                     // [1]
    public static final String XPATH_SELECT_UTWORZ = "//form[contains(@class, \"_featuredLogin__formContainer\")]/div[5]/a";
    public static final String XPATH_SELECT_Name = "//div[contains(@class, \"large_form\")]/div/div/div/div/input";
    public static final String XPATH_SELECT_Surname = "//div[contains(@class, \"large_form\")]/div/div/div[2]/div/div/input";
    public static final String XPATH_SELECT_INPUT_FORM = "//div[contains(@class, \"_8ien\")]";
    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        while(!driver.findElement(By.xpath(XPATH_AcceptAll)).isDisplayed());
        WebElement searchField = driver.findElement(By.xpath(XPATH_AcceptAll));
        searchField.click();
        while(!driver.findElement(By.xpath(XPATH_SELECT_UTWORZ)).isDisplayed());
        WebElement utworzKonto = driver.findElement(By.xpath(XPATH_SELECT_UTWORZ));
        utworzKonto.click();
        Thread.sleep(5000);
        while(!driver.findElement(By.xpath(XPATH_SELECT_INPUT_FORM)).isDisplayed());



        WebElement dayOfBirth = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByValue("4");
        WebElement monthOfBirth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByValue("1");
        WebElement yearOfBirth = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByValue("1988");






        /*WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
        searchField.sendKeys("New robotic task");

        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textareaField.sendKeys("The robotic content");

        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));      // [2]
        Select selectBoard = new Select(selectCombo);                             // [3]
        selectBoard.selectByIndex(1);    */                                         // [4]
    }
}

