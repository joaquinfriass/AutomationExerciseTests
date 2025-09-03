package pages;

public class PrincipalPage extends BasePage {
    
        private String LoggedInAsUsername = "//a[contains(normalize-space(), 'Logged in as')]";

    public PrincipalPage() {
        super(driver);
    }

    //Método para navegar a la página principal
    public void navigateToAutomationExercise() {
        navigateTo("http://www.automationexercise.com");
    }

    //Método para verificar que la página principal es visible
    public boolean isHomePageVisible() {
        // Verifica que el logotipo de la página principal esté visible
        return find("//div[@class='item active']//img[@alt='demo website for practice']").isDisplayed();
    }

    public void clickSignupLogin() {
        clickElement("//a[normalize-space()='Signup / Login']");
    }

    public boolean isNewUserSignupVisible() {
        return find("//h2[normalize-space()='New User Signup!']").isDisplayed();
    }

        public void isLoggedInAsUsernameVisible() {
        find(LoggedInAsUsername).isDisplayed();
    }
    
    public void clickLogoutButton() {
        String logoutButton = "//a[normalize-space()='Logout']";
        clickElement(logoutButton);
    }

}
