package ben.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll
{
    public static void main(String[] args) throws InterruptedException {
        // Set the location of chrome driver to local  download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.sendKeys("Hello");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");
        Thread.sleep(2000);
        driver.quit();
    }
}
