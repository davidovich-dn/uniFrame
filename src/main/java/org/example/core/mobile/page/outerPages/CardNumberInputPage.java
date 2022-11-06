package org.example.core.mobile.page.outerPages;

import io.qameta.allure.Step;
import org.example.core.mobile.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardNumberInputPage extends BasePage {

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
