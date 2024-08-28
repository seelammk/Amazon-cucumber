package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    @Given("I open the browser")
    public void i_open_the_browser() {
        SeleniumUtils.openApplication("https://retailsys.esyacode.com/admin/dashboard");
    }
    @When("I login to the Retailsys applicaiton")
    public void i_login_to_the_retailsys_applicaiton() {
        Login.login("pranata","pranata@9816");
    }
    @Then("I use password to login")
    public void i_use_password_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
