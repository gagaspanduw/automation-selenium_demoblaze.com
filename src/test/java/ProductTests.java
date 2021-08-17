import base.BaseTests;
import org.testng.annotations.Test;
import pages.ProductPage;

import static org.testng.Assert.assertTrue;

public class ProductTests extends BaseTests {

    @Test
    public void addProductTests(){
        ProductPage productPage = homePage.clickSamsung();
        productPage.clickAddToCart();
        assertTrue(productPage.alertGetText().contains("Product added"), "Alert message incorrect");
    }

}
