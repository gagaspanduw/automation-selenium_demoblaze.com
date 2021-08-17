import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactPage;

import static org.testng.Assert.assertTrue;

public class ContactTests extends BaseTests {

    @Test
    public void contactTest(){
        ContactPage contactPage = homePage.clickContact();
        contactPage.setEmail("test@test.com");
        contactPage.setName("test");
        contactPage.setMessage("test message");
        contactPage.clickSendMessage();
        assertTrue(contactPage.getAlertText().contains("Thanks for the message!!"), "Alert message incorrect");
    }
}
