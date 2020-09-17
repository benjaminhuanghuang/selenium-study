package ben.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {
    public static void main(String[] args) throws InterruptedException {
        // Set the location of chrome driver to local  download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/bhuang/Downloads/chromedriver");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement element = null;

        // By Tag
        element = driver.findElement(By.cssSelector("div[type='textField_randomId']"));

        // <input id="q">
        element = driver.findElement(By.cssSelector("input[id='q']"));

        // By Css
        element = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));

        // By XPath
        element = driver.findElement(By.xpath("html/body/div/div[3]/input"));
        /**
         *  Match Text
         */
        // Exact match  <div id="text123">
        element = driver.findElement(By.cssSelector("div[id='text123']"));

        // By Prefix  <div id="textField_randomId">
        element = driver.findElement(By.cssSelector("div[id^='textField']"));

        // By Suffix  <div id="randomId_textField">
        element = driver.findElement(By.cssSelector("div[id$='textField']"));

        // By Substring  <div id="123_textField_randomId">
        element = driver.findElement(By.cssSelector("div[id*='textField']"));

        /**
         *  Find child nodes
         */
        // Find a in <div id="parent">
        element = driver.findElement(By.cssSelector("div#parent a"));


        // Find Nth li in <ul id="parent">
        element = driver.findElement(By.cssSelector("#parent li:nth-child(n)"));


        driver.quit();
    }
}
