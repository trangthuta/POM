package pages;

import core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailsProduct extends BasePage {
    public DetailsProduct(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-test='inventory-item-name']")
    WebElement nameProduct;

    public void verifyNameProduct() {
        getWebDriverWait().until(ExpectedConditions.visibilityOf(nameProduct)) ;
        Assertions.assertEquals("Sauce Labs Backpack" , nameProduct.getText());
    }
}
