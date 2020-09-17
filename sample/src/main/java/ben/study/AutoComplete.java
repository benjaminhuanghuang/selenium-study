package ben.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        // Set the location of chrome driver to local  download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();

        driver.quit();
    }
}
