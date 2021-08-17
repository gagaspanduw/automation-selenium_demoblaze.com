package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    private WebDriver driver;
    private By usernameField = By.id("sign-username");
    private By passwordField = By.id("sign-password");
    private By signupButton = By.xpath("//*[@onclick='register()']");

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    public String alertGetText(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }
}
