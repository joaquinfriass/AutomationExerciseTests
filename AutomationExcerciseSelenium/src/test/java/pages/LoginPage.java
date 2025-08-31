package pages;

public class LoginPage extends BasePage {
    
    //Locators
    private String nameInput = "//input[@placeholder='Name']";
    private String emailInput = "//input[@data-qa='signup-email']";
    private String signupButton = "//button[normalize-space()='Signup']";

    public LoginPage() {
        super(driver);
    }

    //Métodos de acción
    public void enterName(String name) {
        write(nameInput, name);
    }

    public void enterEmail(String email) {
        write(emailInput, email);
    }

    public void clickSignupButton() {
        clickElement(signupButton);
    }
    
}
