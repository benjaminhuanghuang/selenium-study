package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By fromAuthLink = By.linkText("Form Authentication");

    public HomePage(WebDriver d) {
        this.driver = d;
    }

    public LoginPage clickFormAuth() {
        driver.findElement(fromAuthLink).click();
        return new LoginPage(driver);
    }
}
