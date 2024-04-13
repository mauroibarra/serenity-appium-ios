package co.com.demo.stepdefinitions;

import co.com.demo.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.demo.stepdefinitions.Hooks.driver;
import static co.com.demo.stepdefinitions.Hooks.user;

public class LoginStepDefinitions {

    @Given("{string} is at login page")
    public void theUserIsAtLoginPage(String actor) {
        user = Actor.named(actor);
        user.can(BrowseTheWeb.with(driver).asActor(user));
    }
    @When("login with user {string} and password {string}")
    public void loginWithUserAndPassword(String username, String password) {
        user.attemptsTo(
                Login.withDefaultUser()
        );
    }
    @Then("the user will see the form page")
    public void theUserWillSeeTheFormPage() {

    }

}
