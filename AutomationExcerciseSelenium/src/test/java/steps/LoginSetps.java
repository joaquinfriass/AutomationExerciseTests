package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PrincipalPage;

public class LoginSetps{
    
    PrincipalPage principalPage = new PrincipalPage();
    LoginPage loginPage = new LoginPage();

    @When("I click on Signup Login button")
    public void clickSignupLoginAE() {
        principalPage.clickSignupLogin();
    }

    @Then("I should see Login to your account text")
    public void verifyLoginToYourAccount() {
        loginPage.isLoginToYourAccountVisible();
    }

    @When("I enter correct email {string} and password {string}")
    public void enterEmailAndPassword(String email, String password) {
        loginPage.enterEmailLogin(email);
        loginPage.enterPassword(password);
    }

    @And("I click on login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see Logged in as username text")
    public void verifyLoggedInToAccount() {
        principalPage.isLoggedInAsUsernameVisible();
    }

    @When("I click on Logout button")
    public void clickLogoutButton() {
        principalPage.clickLogoutButton();
    }

    @Then("I should be navigated to login page")
    public void verifyNavigatedToLoginPage() {
        loginPage.isLoginToYourAccountVisible();
    }

}
