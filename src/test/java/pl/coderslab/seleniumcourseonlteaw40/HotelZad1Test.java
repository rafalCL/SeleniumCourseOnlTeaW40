package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class HotelZad1Test {
    @Test
    public void zad1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // given
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // when
        WebElement signInButton = driver.findElement(By.cssSelector("a.user_login"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.id("email_create"));
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);

    }
}
