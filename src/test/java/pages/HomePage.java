package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[contains(text(), 'Backpack')]")
    private WebElement firstProduct ;

    public  void clickOnFirstProduct(){
        getWebDriverWait().until(ExpectedConditions.visibilityOf(firstProduct)) ;
        firstProduct.click();
    }
}
