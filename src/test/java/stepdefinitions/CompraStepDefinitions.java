package stepdefinitions;

import steps.CompraSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;



public class CompraStepDefinitions {

    @Steps
    CompraSteps compraSteps;

    @Given("que el usuario ingresa a SauceDemo")
    public void que_el_usuario_ingresa_a_sauce_demo() {
        compraSteps.openPage();
    }

    @When("inicia sesion con usuario {string} y password {string}")
    public void inicia_sesion(String usuario, String password) {
        compraSteps.login(usuario, password);
    }

    @When("agrega dos productos al carrito")
    public void agrega_productos() {
        compraSteps.buy();
    }

    @Then("finaliza la compra y visualiza el mensaje de confirmacion")
    public void valida_compra() {
        Assert.assertEquals(
                "THANK YOU FOR YOUR ORDER",
                compraSteps.confirmation()
        );
    }
}
