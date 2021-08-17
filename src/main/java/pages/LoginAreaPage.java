package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAreaPage {
    private WebDriver driver;
    private By loginResult = By.linkText("Log out");

    public LoginAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginResult(){
        return driver.findElement(loginResult).getText();
    }
}
