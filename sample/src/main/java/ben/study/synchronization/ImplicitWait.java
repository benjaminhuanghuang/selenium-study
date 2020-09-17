package ben.study.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        // Set the location of chrome driver to local  download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("1555 Park Blvd, Palo Alto, CA");
        /**
         *  Bad way : Thread.sleep(1000);
         *  Implicit waits a specified amount of time before throw a no such element exception
         *  Default wait time is 0
         */
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();

        driver.quit();
    }
}
