package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PrincipalPage;
import pages.RegisterPage;

public class RegisterSteps {
    
    PrincipalPage principalPage = new PrincipalPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage  registerPage = new RegisterPage();

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
        loginPage.enterName(name);
        loginPage.enterEmailSigup(email);
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        loginPage.clickSignupButton();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyEnterAccountInformation() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.isEnterAccountInformationVisible();
    }

    @Then("Fill details: Title {string}, Password {string}, Date of birth {string} {string} {string}")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth(String title, String password, String day, String month, String year) {
    
        registerPage.selectTitle(title);
        registerPage.enterPassword(password);
        registerPage.selectDateOfBirth(day, month, year);
    }

    @And("Select checkbox Sign up for our newsletter")
    public void selectCheckboxSignUpForOurNewsletter() {
        registerPage.selectNewsletterCheckbox();
    }

    @Then("Select checkbox Receive special offers from our partners")
    public void selectCheckboxOffersPartners(){
        registerPage.selectOffersCheckbox();
    }

    @And("Fill details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fillDetailsAdressInformation(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterCompany(company);
        registerPage.enterAddress(address);
        registerPage.enterAddress2(address2);
        registerPage.selectCountry(country);
        registerPage.enterState(state);
        registerPage.enterCity(city);
        registerPage.enterZipcode(zipcode);
        registerPage.enterMobileNumber(mobileNumber);
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        registerPage.clickCreateAccountButton();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyAccountCreatedIsVisible() {
        registerPage.isAccountCreatedMessageVisible();
    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        registerPage.clickContinueButton();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyLoggedInAsUsernameIsVisible() {
        principalPage.isLoggedInAsUsernameVisible();
    }

    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        registerPage.clickDeleteAccountButton();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyAccountDeletedIsVisibleAndClickContinueButton() {
        registerPage.isAccountDeletedMessageVisible();
        registerPage.clickContinueButton();
    }
}
