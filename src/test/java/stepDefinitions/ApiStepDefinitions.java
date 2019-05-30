package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.PostRequest;

public class ApiStepDefinitions {

    PostRequest postRequest = new PostRequest();


    @Given("^the user enters the end point url$")
    public void the_user_enters_the_end_point_url() throws Throwable {
        postRequest.endURL();
    }

    @When("^the user sends the POST request$")
    public void the_user_sends_the_POST_request() throws Throwable {
        postRequest.postRequest();
    }

    @Then("^the response is received$")
    public void the_response_is_received() throws Throwable {
        postRequest.getResponse();
    }
}
