package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;
    private By emailField = By.id("recipient-email");
    private By nameField = By.id("recipient-name");
    private By messageField = By.id("message-text");
    private By sendButton = By.xpath("//*[@onclick='send()']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setMessage(String message){
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickSendMessage(){
        driver.findElement(sendButton).click();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
