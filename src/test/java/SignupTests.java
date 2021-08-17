import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;

import static org.testng.Assert.*;

public class SignupTests extends BaseTests {

    @Test
    public void testSignupUserExist(){
        SignupPage signupPage = homePage.clickSignUp();
        signupPage.setUsernameField("admin");
        signupPage.setPasswordField("admin");
        signupPage.clickSignupButton();
        assertTrue(signupPage.alertGetText().contains("This user already exist."), "Alert text is incorrect");
        signupPage.alertAccept();
    }

    @Test
    public void testSignupInputBlank(){
        SignupPage signupPage = homePage.clickSignUp();
        signupPage.clickSignupButton();
        assertTrue(signupPage.alertGetText().contains("Please fill out Username and Password."), "Alert text is incorrect");
        signupPage.alertAccept();
    }

}
