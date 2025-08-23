package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import pages.PrincipalPage;

public class RegisterSteps {
    
    PrincipalPage principalPage = new PrincipalPage();


    @Given("I navigate to www.automationexercise.com")
    public void iNavigateAE() {
        principalPage.navigateToAutomationExercise();
    }

    @Then("Verify that home page is visible successfully")
    public void verifyHomePage() {
        principalPage.isHomePageVisible();
    }

    @And("Click on Signup Login button")
    public void clickSignupLoginAE() {
        principalPage.clickSignupLogin();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignup() {
        // Write code here that turns the phrase above into concrete actions
        principalPage.isNewUserSignupVisible();
    }

    @And("Enter name and email address")
    public void enterEmailAndNameAddress() {
        // Ingresar Codigo
    }
}
