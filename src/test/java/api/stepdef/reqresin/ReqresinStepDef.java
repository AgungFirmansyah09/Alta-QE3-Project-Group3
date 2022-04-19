package api.stepdef.reqresin;
import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ReqresinStepDef {

    Reqresin reqresin = new Reqresin();

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe (int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("^response structure should match json schema \"([^\"]*)\"$")
    public void responseStructureShouldMatchJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        System.out.println(path);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @When("user send POST login request to reqresin")
    public void userSendPOSTLoginRequestToReqresin() {
        reqresin.postLogin();
    }


    @When("user send POST register request to reqresin")
    public void userSendPOSTRegisterRequestToReqresin() {
        reqresin.postRegister();
    }


    @When("user send POST Create users request to reqresin")
    public void userSendPOSTCreateUsersRequestToReqresin() {
        reqresin.postCreate();
    }


    @When("user send POST login request to reqresin and faild email")
    public void userSendPOSTLoginRequestToReqresinAndFaildEmail() {
        reqresin.postLoginFail();
    }

}
