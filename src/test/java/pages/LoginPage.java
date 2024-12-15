package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver d){
        super(d);
    }

    @FindBy(id = "user-name")
    private WebElement username ;

    @FindBy(id = "password")
    private WebElement password ;

    @FindBy(id = "login-button")
    private WebElement loginButton ;

    public void enterAValidEmail(){
       getWebDriverWait().until(ExpectedConditions.visibilityOf(username)) ;
        username.clear();
        username.sendKeys("standard_user");
    }

    public void enterAValidPassword(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(password)) ;
        password.clear();
        password.sendKeys("secret_sauce");
    }

    public void clickOnLoginButton(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(loginButton)) ;
        loginButton.click();
    }



}
