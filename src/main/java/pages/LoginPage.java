package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("loginusername");
    private By passwordField = By.xpath("//*[@id='loginpassword']");
    private By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public LoginAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoginAreaPage(driver);
    }


}
