package us.piit;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class AppTest extends CommonAPI {

    @Test
    public void RadioButton() throws InterruptedException {

        List<WebElement> listOfRadio = driver.findElements(By.xpath("//div[@id=\"radio-btn-example\"]"));
        for (WebElement Radio : listOfRadio = driver.findElements(By.xpath("//input[@type='radio']"))) {
            Thread.sleep(2000);
            if (Radio.equals("radio1")) ;
            Radio.click();
        }
        Thread.sleep(2000);
    }


    @Test
    public void SuggessionClassExample() throws InterruptedException {
        suggestion("//input[@id='autocomplete']","can","Central African Republic","//ul[@id=\"ui-id-1\"]/li");
        Thread.sleep(2000);
    }


    @Test
    public void dropdown() throws InterruptedException {
        selectFromDropdown("//select[@id=\"dropdown-class-example\"]","Option1");
        Thread.sleep(3000);
        selectFromDropdown("//select[@id=\"dropdown-class-example\"]","Option2");
        Thread.sleep(3000);
        selectFromDropdown("//select[@id=\"dropdown-class-example\"]","Option3");
        Thread.sleep(2000);

    }

    @Test

    public void checkBox() throws InterruptedException {
        checkBox("//input[@type='checkbox']","//input[@id='checkBoxOption2']");

    }

    @Test
    public void SwitchTab(){
        click("//a[@id='opentab']");
        switchHandle();
        click("//a[@class=\"theme-btn register-btn\"]");
    }


    @Test
    public void SwitchWindow() throws InterruptedException {
        click("//Button[@id='openwindow']");
        switchHandle();
        click("//a[text()='Contact']");
        Thread.sleep(2000);
    }

    @Test
    public void alerts() throws InterruptedException {
        type("//input[@id='name']","jack");
        click("//input[@id='alertbtn']");
        alertAccept();
        Thread.sleep(2000);
    }
    @Test
    public void confirm() throws InterruptedException {
        type("//input[@id='name']","jack");
        click("//input[@id=\"confirmbtn\"]");
        alertsDismiss();
        Thread.sleep(2000);

    }


@Test
    public void reload() throws InterruptedException {

    scrollDown();
    hoverOver("//button[@id=\"mousehover\"]");
    click("//a[text()='Reload']");
    Thread.sleep(2000);

}
@Test
public void top() throws InterruptedException {
    scrollDown();
    hoverOver("//button[@id=\"mousehover\"]");
    click("//a[text()='Top']");
    Thread.sleep(2000);


}
    @Test
    public void switchFrame() throws InterruptedException {
        scrollDown();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"courses-iframe\"]")));
        click("//a[@class=\"theme-btn register-btn\"]");
        Thread.sleep(2000);

    }

    @Test
    public void elementDisplay() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
        System.out.println(element.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();
        System.out.println(element.isDisplayed());
        driver.findElement(By.xpath("//input[@id=\"show-textbox\"]"));
        System.out.println(element.isDisplayed());

        Thread.sleep(2000);

    }

}
