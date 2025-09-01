package pages;

public class RegisterPage extends BasePage {
    
    //Locators Account Information
    private String TitleMr = "//input[@id='id_gender1']";
    private String TitleMrs = "//input[@id='id_gender2']";
    private String PasswordInput = "//input[@id='password']";
    private String DaysSelect = "//select[@id='days']";
    private String MonthsSelect = "//select[@id='months']";
    private String YearsSelect = "//select[@id='years']";
    private String NewsletterCheckbox = "//input[@id='newsletter']";
    private String OffersCheckbox = "//input[@id='optin']";

    //Locators Address Information
    private String FirstNameInput = "//input[@id='first_name']";
    private String LastNameInput = "//input[@id='last_name']";
    private String CompanyInput = "//input[@id='company']";
    private String Address1Input = "//input[@id='address1']";
    private String Address2Input = "//input[@id='address2']";
    private String CountrySelect = "//select[@id='country']";
    private String StateInput = "//input[@id='state']";
    private String CityInput = "//input[@id='city']";
    private String ZipcodeInput = "//input[@id='zipcode']";
    private String MobileNumberInput = "//input[@id='mobile_number']";
    private String CreateAccountButton = "//button[normalize-space()='Create Account']";
    private String AccountCreatedMessage = "//b[normalize-space()='Account Created!']";
    private String ContinueButton = "//a[normalize-space()='Continue']";
    private String LoggedInAsUsername = "//a[contains(normalize-space(), 'Logged in as')]";
    private String DeleteAccountButton = "//a[normalize-space()='Delete Account']";
    private String AccountDeletedMessage = "//b[normalize-space()='Account Deleted!']";

    public RegisterPage() {
        super(driver);
    }
    
    public boolean isEnterAccountInformationVisible() {
        return find("//b[normalize-space()='Enter Account Information']").isDisplayed();
    }

    public void selectTitle(String title) {
        if (title.equalsIgnoreCase("Mr")) {
            clickElement(TitleMr);
        } else if (title.equalsIgnoreCase("Mrs")) {
            clickElement(TitleMrs);
        }
    }

    public void enterPassword(String password) {
        write(PasswordInput, password);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        selectFromDropdownByValue(DaysSelect, day);
        selectFromDropdownByValue(MonthsSelect, month);
        selectFromDropdownByValue(YearsSelect, year);
    }

    public void selectNewsletterCheckbox() {
        clickElement(NewsletterCheckbox);
    }

    public void selectOffersCheckbox() {
        clickElement(OffersCheckbox);
    }

    public void enterFirstName(String firstName) {
        write(FirstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        write(LastNameInput, lastName);
    }

    public void enterCompany(String company) {
        write(CompanyInput, company);
    }

    public void enterAddress(String address) {
        write(Address1Input, address);
    }

    public void enterAddress2(String address2) {
        write(Address2Input, address2);
    }

    public void selectCountry(String country) {
        selectFromDropdownByValue(CountrySelect, country);
    }

    public void enterState(String state) {
        write(StateInput, state);
    }

    public void enterCity(String city) {
        write(CityInput, city);
    }

    public void enterZipcode(String zipcode) {
        write(ZipcodeInput, zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        write(MobileNumberInput, mobileNumber);
    }

    public void clickCreateAccountButton() {
        clickElement(CreateAccountButton);
    }

    public boolean isAccountCreatedMessageVisible() {
        return find(AccountCreatedMessage).isDisplayed();
    }

    public void clickContinueButton() {
        clickElement(ContinueButton);
    }

    public void isLoggedInAsUsernameVisible() {
        find(LoggedInAsUsername).isDisplayed();
    }

    public void clickDeleteAccountButton() {
        clickElement(DeleteAccountButton);
    }

    public boolean isAccountDeletedMessageVisible() {
        return find(AccountDeletedMessage).isDisplayed();
    }


}
