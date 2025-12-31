package steps;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CompraSteps {

    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;

    public void openPage() {
        loginPage.open();
    }

    public void login(String user, String pass) {
        loginPage.login(user, pass);
    }

    public void buy() {
        productsPage.addProducts();
        cartPage.checkout();
        checkoutPage.completeForm();
    }

    public String confirmation() {
        return checkoutPage.getMessage();
    }
}
