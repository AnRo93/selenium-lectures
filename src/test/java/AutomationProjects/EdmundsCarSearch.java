package AutomationProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EdmundsCarSearch {


    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.edmunds.com/");



        driver.findElement(By.xpath("//a[@data-tracking-id='home_page_inventory_select_tab']")).click();

//        Thread.sleep(2000);
        new Actions(driver).doubleClick(driver.findElement(By.xpath("//input[@data-test='zip-input']"))).sendKeys("22031").perform();


//        driver.findElement(By.xpath("//span[@title='Only show local listings']")).click();

        Thread.sleep(2000);

        WebElement checkbox = driver.findElement(By.xpath("//span[@title='Only show local listings']"));
        if(!checkbox.isSelected()){
            checkbox.click();
        }

        Thread.sleep(2000);

        Select makeDropdown = new Select(driver.findElement(By.cssSelector("select[name='make']")));

        Assert.assertEquals(makeDropdown.getFirstSelectedOption().getText(),"Add Make");

        makeDropdown.selectByVisibleText("Tesla");

        Thread.sleep(2000);

        Select makeDropdown2 = new Select(driver.findElement(By.cssSelector("select[name='model']")));

        Assert.assertEquals(makeDropdown2.getFirstSelectedOption().getText(),"Add Model");

        makeDropdown2.selectByVisibleText("Model 3");

        Thread.sleep(2000);

        new Actions(driver).doubleClick(driver.findElement(By.xpath("//input[@id='min-value-input-Year']"))).sendKeys(" 2020").perform();

    }

}
