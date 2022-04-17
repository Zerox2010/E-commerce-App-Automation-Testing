package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginLink = By.linkText("Log in");
    private By rememberMe = By.id("RememberMe");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage clickLRegisterButton() {
        clickLink("Register");
        return new RegistrationPage(driver);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void chooseRememberMe() {
        driver.findElement(rememberMe).click();
    }

    public ResetPasswordPage clickForgetPasswordLink() {
        clickLink("Forgot password?");
        return new ResetPasswordPage(driver);
    }

    public HomePage clickLogInButton() {
        driver.findElement(loginLink).click();
        return new HomePage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
