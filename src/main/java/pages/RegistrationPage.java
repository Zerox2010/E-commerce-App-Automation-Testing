package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private WebDriver driver;
    private By genderMale = By.id("gender-male");
    private By genderFemale = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By dateOfBirthDay = By.name("DateOfBirthDay");
    private By dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By dateOfBirthYear = By.name("DateOfBirthYear");
    private By email = By.id("Email");
    private By companyName = By.id("Company");
    private By newsLetter = By.id("Newsletter");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By continueButton = By.linkText("Continue");




    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMaleButton(){
       // clickLink("genderMale");
        driver.findElement(genderMale).click();
    }
    public HomePage clickContinueButton(){
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }

    public void clickFemaleButton(){
        driver.findElement(genderFemale).click();
    }
    public void selectBirthDay(String value){
        Select birthDayElement = new Select(driver.findElement(dateOfBirthDay));
       birthDayElement.selectByValue(value);
    }
    public void selectBirthMonth(String value){
        Select birthDayElement = new Select(driver.findElement(dateOfBirthMonth));
        birthDayElement.selectByValue(value);
    }
    public void selectBirthYear(String value){
        Select birthDayElement = new Select(driver.findElement(dateOfBirthYear));
        birthDayElement.selectByValue(value);
    }
    public void enterFirstName(String value){
        driver.findElement(firstName).sendKeys(value);
    }
    public void enterLastName(String value){
        driver.findElement(lastName).sendKeys(value);
    }
//    private Select findDropDownElement(){
//        return new Select(driver.findElement(dateOfBirthDay));
//    }
//    public List<String> getSelectedOptions(String value){
//        List <WebElement> selectedElements =
//                selectBirthDay(value).
//        //return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
//    }
    public void enterEmail(String value){
        driver.findElement(email).sendKeys(value);
    }
    public void enterCompanyName(String value){
        driver.findElement(companyName).sendKeys(value);
    }
    public void enterPassword(String value){
        driver.findElement(password).sendKeys(value);
    }
    public void enterConfirmPassword(String value){
        driver.findElement(confirmPassword).sendKeys(value);
    }
    public RegistrationCompletedPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegistrationCompletedPage(driver);
    }


}
