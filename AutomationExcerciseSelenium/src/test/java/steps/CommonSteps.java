package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PrincipalPage;
import pages.RegisterPage;

public class CommonSteps {
    
    PrincipalPage principalPage = new PrincipalPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage  registerPage = new RegisterPage();

    @Given("I navigate to www.automationexercise.com")
    public void iNavigateAE() {
        principalPage.navigateToAutomationExercise();
    }

}
