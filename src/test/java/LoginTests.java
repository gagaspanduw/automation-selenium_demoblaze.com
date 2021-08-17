import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginAreaPage;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setUsernameField("admin");
        loginPage.setPasswordField("admin");
        LoginAreaPage loginAreaPage = loginPage.clickLoginButton();
        assertTrue(loginAreaPage.getLoginResult().contains("Log out"), "The result is incorrect");
    }
}
