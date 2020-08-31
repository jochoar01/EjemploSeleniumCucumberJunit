package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.facebookPage;

public class FacebookTest {

    private WebDriver driver;
    facebookPage page;

    @Given("^El usuario puede acceder a pagina principal de facebook$")
    public void el_usuario_puede_acceder_a_pagina_principal_de_facebook() throws Throwable {
        page = new facebookPage(driver);
        driver= page.conexionConChrome();
        page.visit("http://www.facebook.com");
        driver.manage().window().maximize();
    }

    @When("^se hace el registro en facebook$")
    public void se_hace_el_registro_en_facebook() throws Throwable {
        page.ir_a_pagina_de_registro();
    }

    @Then("^y se valida letrero \"([^\"]*)\"$")
    public void y_se_valida_letrero(String texto) throws Throwable {
        page.validar_letrero_y_cerrar(texto);
        page.close();
    }

    /*@Then("^y se valida letrero \"([^\"]*)\"$")
    public void y_se_valida_letrero() throws Throwable {
        page.validar_letrero_y_cerrar();
        driver.quit();
    }*/

}
