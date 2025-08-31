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
    private String CountrySelect = "//select[@id='country']";
    private String StateInput = "//input[@id='state']";
    private String CityInput = "//input[@id='city']";
    private String ZipcodeInput = "//input[@id='zipcode']";
    private String MobileNumberInput = "//input[@id='mobile_number']";
    private String CreateAccountButton = "//button[normalize-space()='Create Account']";

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
}
