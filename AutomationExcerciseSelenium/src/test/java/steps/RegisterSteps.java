package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PrincipalPage;
import pages.RegisterPage;

public class RegisterSteps {
    
    PrincipalPage principalPage = new PrincipalPage();
    LoginPage LoginPage = new LoginPage();
    RegisterPage  RegisterPage = new RegisterPage();


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

    @And("Enter name {string} and email address {string}")
    public void enterEmailAndNameAddress(String name, String email) {
        LoginPage.enterName(name);
        LoginPage.enterEmail(email);
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        LoginPage.clickSignupButton();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyEnterAccountInformation() {
        // Write code here that turns the phrase above into concrete actions
        RegisterPage.isEnterAccountInformationVisible();
    }

    @Then("Fill details: Title {string}, Password {string}, Date of birth {string} {string} {string}")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth(String title, String password, String day, String month, String year) {
    
        RegisterPage.selectTitle(title);
        RegisterPage.enterPassword(password);
        RegisterPage.selectDateOfBirth(day, month, year);
    }
}
