package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By orderButton = By.cssSelector(".btn-success");
    private By purchaseButton = By.xpath("//*[@onclick='purchaseOrder()']");
    private By nameField = By.id("name");
    private By countryField = By.id("country");
    private By cityField = By.id("city");
    private By creditCardField = By.id("card");
    private By monthField = By.id("month");
    private By yearField = By.id("year");
    private By resultPurchase = By.cssSelector(".sweet-alert > h2");
    private By acceptPurchaseButton = By.cssSelector(".confirm");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPlaceOrder(){
        driver.findElement(orderButton).click();
    }

    public void clickPurchase(){
        driver.findElement(purchaseButton).click();
    }

    public void setNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setCountryField(String country){
        driver.findElement(countryField).sendKeys(country);
    }

    public void setCityField(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void setCreditCardField(String card){
        driver.findElement(creditCardField).sendKeys(card);
    }

    public void setMonthField(String month){
        driver.findElement(monthField).sendKeys(month);
    }

    public void setYearField(String year){
        driver.findElement(yearField).sendKeys(year);
    }

    public void clickOkPurchase(){
        driver.findElement(acceptPurchaseButton).click();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(resultPurchase).getText();
    }
}
