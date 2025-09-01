package steps;

import io.cucumber.java.bs.A;
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

    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        RegisterPage.selectNewsletterCheckbox();
    }

    @Then("Select checkbox Receive special offers from our partners")
    public void selectCheckboxOffersPartners(){
        RegisterPage.selectOffersCheckbox();
    }

    @And("Fill details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fillDetailsAdressInformation(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        RegisterPage.enterFirstName(firstName);
        RegisterPage.enterLastName(lastName);
        RegisterPage.enterCompany(company);
        RegisterPage.enterAddress(address);
        RegisterPage.enterAddress2(address2);
        RegisterPage.selectCountry(country);
        RegisterPage.enterState(state);
        RegisterPage.enterCity(city);
        RegisterPage.enterZipcode(zipcode);
        RegisterPage.enterMobileNumber(mobileNumber);
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        RegisterPage.clickCreateAccountButton();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyAccountCreatedIsVisible() {
        RegisterPage.isAccountCreatedMessageVisible();
    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        RegisterPage.clickContinueButton();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyLoggedInAsUsernameIsVisible() {
        RegisterPage.isLoggedInAsUsernameVisible();
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        RegisterPage.clickDeleteAccountButton();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyAccountDeletedIsVisibleAndClickContinueButton() {
        RegisterPage.isAccountDeletedMessageVisible();
        RegisterPage.clickContinueButton();
    }
}
