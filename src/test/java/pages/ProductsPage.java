package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class ProductsPage extends PageObject {

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElementFacade product1;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElementFacade product2;

    @FindBy(className = "shopping_cart_link")
    WebElementFacade cart;

    public void addProducts() {
        product1.click();
        product2.click();
        cart.click();
    }
}
