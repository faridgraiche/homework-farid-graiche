package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/farid/eclipse-workspace/revieu/src/driver/chromedriver 3");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    }

    public void switchHandle() {
        String firstWindow = driver.getWindowHandle();
        for (String childTab : driver.getWindowHandles()) {
            driver.switchTo().window(childTab);
        }


    }

    @AfterMethod
    public void aftermethod() {
        driver.quit();
    }

    public void click(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).click();
        }

    }

    public void type(String locator, String text) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(text);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }

    }

    public void selectFromDropdown(String dropdownLocator, String option) {
        WebElement element = driver.findElement(By.xpath(dropdownLocator));
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);
        }


    }

    public void suggestion(String suggestionLocator, String textToEnter, String textLookingFor, String listOfSuggestion) throws InterruptedException {

        driver.findElement(By.xpath(suggestionLocator)).sendKeys(textToEnter);
        List<WebElement> listOfElements = driver.findElements(By.xpath(listOfSuggestion));
        for (WebElement element : listOfElements) {
            if (element.getText().equals(textLookingFor)) {
                element.click();
            }
        }
        Thread.sleep(2000);
    }

    public void alertsDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }

    public void alertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkBox(String listLocator,String optionToUncheck) throws InterruptedException {
        List<WebElement> listOfElements = driver.findElements(By.xpath(listLocator));
        for (WebElement options : listOfElements) {
            options.click();
        }
        Thread.sleep(1000);
        WebElement Option2 = driver.findElement(By.xpath(optionToUncheck));
        boolean isSelected = Option2.isDisplayed();
        if (isSelected) {
            Option2.click();
        }
        if (!isSelected) {
            Option2.isDisplayed();
        }
        Thread.sleep(2000);

    }
    public void scrollDown() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(3000);
    }

    public void hoverOver(String locator) throws InterruptedException {
        WebElement element= driver.findElement(By.xpath(locator));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(3000);

    }

}