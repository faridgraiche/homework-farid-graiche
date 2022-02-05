package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;
    @BeforeMethod
    public void beforetest(){
        System.setProperty("webdriver.chrome.driver","/Users/farid/eclipse-workspace/week1/homework5/firstprojectselenium/src/driver/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    
  @Test
    public void test1(){
        driver.findElement(By.xpath("//button[@class='-oneX-header-top-menu-btn']")).click();
      driver.findElement(By.xpath("//input[@id='oneX-username']")).sendKeys("farid");
      driver.findElement(By.xpath("//input[@id='util-login-password']")).sendKeys("abcd");
      driver.findElement(By.xpath("//button[@class='-oneX-util-login-button -oneX-btn-primary -oneX-btn-fit-content']")).click();

  }
@Test
    public void test2() {
    driver.findElement(By.xpath("//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[7]/div/button")).click();
    driver.findElement(By.xpath("//input[@id='oneX-findAnAgentZipCode']")).sendKeys("11214");
    driver.findElement(By.xpath("//button[@id='findAnAgentButton']")).click();
    driver.findElement(By.xpath("//*[@id=\"searchResults\"]/div[1]/div[4]/div[3]/a")).click();

//    driver.findElement(By.xpath("//*[@id=\"email-agent-link\"]/span")).click();


}
@Test
    public void test3(){
     driver.findElement(By.xpath("//button[@class='-oneX-header-top-menu-btn -oneX-header-top-menu-btn__has-submenu'and@data-for='banking']")).click();
     driver.findElement(By.xpath("//*[@id=\"oneX-submenu-banking\"]/div/div/div[1]/section/ul[1]/li[1]/a")).click();

    }

    @Test
    public void test4(){
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-main-nav > ul > li:nth-child(1) > div > button > span")).click();
        driver.findElement(By.cssSelector("#oneX-submenu-insurance > div > div > div:nth-child(1) > section > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("input[id='quote-main-zip-code-input']")).sendKeys("11214");
        driver.findElement(By.cssSelector("#quote-main-zip-code-button-1")).click();

    }
@Test
    public void test5(){
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-main-nav > ul > li:nth-child(5) > div > button > span")).click();
        driver.findElement(By.cssSelector("#pay-a-bill-phoneNo")).sendKeys("9292893646");
        driver.findElement(By.cssSelector("#pay-a-bill-DOB")).sendKeys("01-22-1990");
        driver.findElement(By.cssSelector("button[id='pay-a-bill-submitButton']")).click();

    }
    @Test
    public void test6(){
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-main-nav > ul > li:nth-child(6) > div > button > span")).click();
        driver.findElement(By.cssSelector("#oneX-submenu-claims > div > div > div.-oneX-col-12.-oneX-col-md-5.-oneX-claims-menu > ul > li:nth-child(1) > a")).click();

    }

    @Test
    public void test7(){
        driver.findElement(By.xpath("//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[3]/div/button/span")).click();
        driver.findElement(By.cssSelector("#oneX-1-investments")).click();
    }

    @Test
    public void test8(){
        driver.findElement(By.xpath("//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[4]/div/button/span")).click();
        driver.findElement(By.xpath("//select[@id='getaquote-select-product']")).sendKeys("life");
        driver.findElement(By.xpath("//select[@id='getaquote-state-select']")).sendKeys("ny");
        driver.findElement(By.xpath("//*[@id=\"getaQuoteButton\"]")).click();
    }
    @Test
    public void test9(){
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-util-nav > ul > li:nth-child(3) > button > span")).click();
        driver.findElement(By.cssSelector("#util-sf-search")).sendKeys("auto");
        driver.findElement(By.cssSelector("#oneX-submenu-search > div > form > button")).click();
    }

    @Test
    public void test10() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[3]/a")).click();
    }
  @AfterMethod
  public void aftermethod()  {
//      driver.close();


  }

}
