package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.facebookPage;

public class Prueba {

    private WebDriver driver;
    facebookPage page;

    @Given("^given$")
    public void given() throws Throwable {
        System.out.println("given");
    }

    @When("^when$")
    public void when() throws Throwable {
        System.out.println("when");
    }

    @Then("^then$")
    public void then() throws Throwable {
        System.out.println("then");
    }



}
