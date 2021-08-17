import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartPage;

import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTests {

    @Test
    public void cartOrderTests(){
        CartPage cartPage = homePage.clickCart();
        cartPage.clickPlaceOrder();
        cartPage.setNameField("test name");
        cartPage.setCountryField("test country");
        cartPage.setCityField("test city");
        cartPage.setCreditCardField("test card");
        cartPage.setMonthField("test month");
        cartPage.setYearField("test year");
        cartPage.clickPurchase();
        assertTrue(cartPage.getResult().contains("Thank you for your purchase!"), "Alert message incorrect");
    }

    @Test
    public void cartOrderBlankTests(){
        CartPage cartPage = homePage.clickCart();
        cartPage.clickPlaceOrder();
        cartPage.clickPurchase();
        assertTrue(cartPage.getResult().contains("Please fill out Name and Creditcard."), "Alert message incorrect");
    }
}
