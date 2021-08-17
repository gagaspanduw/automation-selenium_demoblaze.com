package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;
    private By addToCartButton = By.xpath("//*[@onclick='addToCart(1)']");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public String alertGetText(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }
}
