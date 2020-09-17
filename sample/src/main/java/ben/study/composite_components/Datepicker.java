package ben.study.composite_components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker
{
    public static void main(String[] args) throws InterruptedException {
        // Set the location of chrome driver to local  download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("03/03/2020");
        date.sendKeys(Keys.RETURN);


        Thread.sleep(2000);

        driver.quit();
    }
}
