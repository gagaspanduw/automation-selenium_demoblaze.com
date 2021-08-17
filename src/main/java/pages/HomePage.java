package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLoginPage(){
        clickLink("Log in");
        return new LoginPage(driver);
    }

    public SignupPage clickSignUp(){
        clickLink("Sign up");
        return new SignupPage(driver);
    }

    public ContactPage clickContact(){
        clickLink("Contact");
        return new ContactPage(driver);
    }

    public AboutusPage clickAboutus(){
        clickLink("About us");
        return new AboutusPage(driver);
    }

    public ProductPage clickSamsung(){
        clickLink("Samsung galaxy s6");
        return new ProductPage(driver);
    }

    public CartPage clickCart(){
        clickLink("Cart");
        return new CartPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
