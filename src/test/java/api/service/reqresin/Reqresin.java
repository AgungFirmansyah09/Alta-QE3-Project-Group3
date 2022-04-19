package api.service.reqresin;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

public class Reqresin {
    private static final String REQRESIN_BASEURL = "https://reqres.in";



    //GetUser single
    public void getSingleUser (){
        SerenityRest.get(REQRESIN_BASEURL + "/api/users/2");
    }

    // Post Create
    public void postCreate () {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put ("name", "morpheus");
        bodyJson.put ("job", "leader");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/users");
    }

    // Post Login
    public void postLogin () {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put ("email", "eve.holt@reqres.in");
        bodyJson.put ("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }

    // Post Login Fail
    public void postLoginFail () {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put ("email", "sydney@fife");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/login");
    }


    // Post Register
    public void postRegister () {
        JSONObject bodyJson = new JSONObject();
        bodyJson.put ("email", "eve.holt@reqres.in");
        bodyJson.put ("password", "pistol");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/register");
    }



}
