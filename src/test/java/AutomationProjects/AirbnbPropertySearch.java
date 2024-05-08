package AutomationProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AirbnbPropertySearch {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.airbnb.com/");

        driver.findElement(By.xpath("//button[@data-testid='cypress-headernav-profile']")).click();

        driver.findElement(By.linkText("Log in")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@data-testid='social-auth-button-email']")).click();

        driver.findElement(By.xpath("//input[@data-testid='email-login-email']")).sendKeys("sinivo4633@molyg.com", Keys.ENTER);

        driver.findElement(By.xpath("//input[@data-testid='email-signup-password']")).sendKeys("DuoTech123", Keys.TAB,Keys.TAB, Keys.ENTER);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Secure your account - Airbnb']")).sendKeys(Keys.TAB, Keys.ENTER);

        Thread.sleep(1000);



//        driver.quit();

    }
}
