package seleniumgluecode;

import Apis.PeliculasObject;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ApiTest {
    String endPoint;
    HttpResponse<JsonNode> jsonResponse;
    Gson gson = new Gson();
    PeliculasObject peliculasObject;


    @Given("^que puedo usar la url \"([^\"]*)\"$")
    public void que_puedo_usar_la_url(String arg1) throws UnirestException {
        this.endPoint = arg1;
    }



    @When("^hacer consumo de api$")
    public void hacer_consumo_de_api() throws Throwable {
        jsonResponse=Unirest.get(endPoint)
                .header("accept","application/json")
                .asJson();
    }

    @Then("^valido en el \"([^\"]*)\" el \"([^\"]*)\"$")
    public void valido_en_el_el(String arg1, String arg2)  {
        String opt=arg1;
        switch (opt){
            case "response":
                this.peliculasObject = gson.fromJson(String.valueOf(jsonResponse.getBody()),PeliculasObject.class);
                Assert.assertEquals(arg2,peliculasObject.getResponse());
                System.out.println(peliculasObject.getResponse());


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opt);
        }

    }



}
