package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickLogInLink();
        loginPage.setEmail("test@gmail.com");
        loginPage.setPassword("test123");
        HomePage homePage = loginPage.clickLogInButton();
        //homePage.checkLogoutIsDisplayed();
//
//        softAssert.equals(homePage.checkLogoutIsDisplayed());
//        softAssert.assertAll();

    }
}
