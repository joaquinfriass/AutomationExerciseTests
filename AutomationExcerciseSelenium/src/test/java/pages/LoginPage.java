package pages;

public class LoginPage extends BasePage {
    
    //Locators
    private String nameInput = "//input[@placeholder='Name']";
    private String emailSignupInput = "//input[@data-qa='signup-email']";
    private String emailLoginInput = "//input[@data-qa='login-email']";
    private String signupButton = "//button[normalize-space()='Signup']";

    public LoginPage() {
        super(driver);
    }

    //Métodos de acción
    public void enterName(String name) {
        write(nameInput, name);
    }

    public void enterEmailSigup(String email) {
        write(emailSignupInput, email);
    }

    public void enterEmailLogin(String email) {
        write(emailLoginInput, email);
    }

    public void enterPassword(String password) {
        String passwordInput = "//input[@placeholder='Password']";
        write(passwordInput, password);
    }

    public void clickSignupButton() {
        clickElement(signupButton);
    }

    public boolean isLoginToYourAccountVisible() {
        String loginToYourAccountText = "//h2[normalize-space()='Login to your account']";
        return find(loginToYourAccountText).isDisplayed();
    }

    public void clickLoginButton() {
        String loginButton = "//button[normalize-space()='Login']";
        clickElement(loginButton);
    }
    
}
