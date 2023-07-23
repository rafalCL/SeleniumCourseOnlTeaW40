package pl.coderslab.seleniumcourseonlteaw40;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// (pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole stron)
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com

public class SelectorsExampleTest {
    @Test
    public void byId() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationInputBox = driver.findElement(By.id("hotel_location"));
        hotelLocationInputBox.sendKeys("Warsaw");

        WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));
        WebElement emailInputBox = driver.findElement(By.id("newsletter-input"));
        emailInputBox.sendKeys("ala@makota.pl");
    }
}
