package org.example.core.mobile.page;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.example.core.mobile.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardNumberInputPage extends BasePage {

    MobileDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public CardNumberInputPage() {
        super();
    }

    WebElement loginInput = wait.until(d -> d.findElement(By.id("txtLoginCheckCardNumber")));

    WebElement nextButton = wait.until(d -> d.findElement(By.id("progressbutton_btn")));

    @Step("sssdasdasd")
    public void cardNumberType(String cardNumber) {
        loginInput.sendKeys(cardNumber);
    }

    @Step("sdasfdasfasfsafasf")
    public void clickNextButton() {
        nextButton.click();
    }
}
