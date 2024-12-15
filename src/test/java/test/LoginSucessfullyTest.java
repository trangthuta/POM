package test;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.DetailsProduct;
import pages.HomePage;
import pages.LoginPage;

public class LoginSucessfullyTest extends BaseTest {
    @Test
    public void loginSucessfullyTest(){
        LoginPage loginPage = new LoginPage(getDriver()) ;
        loginPage.enterAValidEmail();
        loginPage.enterAValidPassword();
        loginPage.clickOnLoginButton();

        HomePage homePage = new HomePage(getDriver()) ;
        homePage.clickOnFirstProduct();

        DetailsProduct detailsProduct = new DetailsProduct(getDriver()) ;
        detailsProduct.verifyNameProduct();

    }
}
