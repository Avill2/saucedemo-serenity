package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    WebElementFacade firstName;

    @FindBy(id = "last-name")
    WebElementFacade lastName;

    @FindBy(id = "postal-code")
    WebElementFacade zip;

    @FindBy(id = "continue")
    WebElementFacade cont;

    @FindBy(id = "finish")
    WebElementFacade finish;

    @FindBy(className = "complete-header")
    WebElementFacade confirmation;

    public void completeForm() {
        firstName.type("Andrea");
        lastName.type("Test");
        zip.type("12345");
        cont.click();
        finish.click();
    }

    public String getMessage() {
        return confirmation.getText();
    }
}
