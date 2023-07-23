package pl.coderslab.seleniumcourseonlteaw40.examples;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsExampleTest {
    @Test
    public void searchWithDuckDuckGo() {
        // given
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // when
        WebElement signIn = driver.findElement(By.cssSelector("#header > div:nth-child(3) > div > div > div.nav_menu_padding.header_user_info.pull-right.hidden-xs > ul > li > a > span"));
        // then
        String linkText = signIn.getText();
        System.out.println(linkText);
        System.out.println(signIn.isDisplayed());
        System.out.println(signIn.getTagName());
        System.out.println(signIn.isEnabled());
        System.out.println(signIn.isSelected());
        System.out.println(signIn.getAttribute("class"));
//        pomozPromowacLink.click();
        //driver.quit();
    }
}
