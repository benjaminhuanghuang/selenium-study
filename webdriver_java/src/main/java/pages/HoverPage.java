package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");

    public HoverPage(WebDriver driver){

    }

    public void hoverOverFigure(int index){
        WebElement figure  = driver.findElements(figureBox).get(index -1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
    }

}
