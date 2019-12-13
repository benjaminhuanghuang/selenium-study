package ben.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        // Input
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Hello");

        // button
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
