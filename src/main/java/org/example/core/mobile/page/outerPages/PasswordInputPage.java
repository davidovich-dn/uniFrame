package org.example.core.mobile.page.outerPages;

import io.qameta.allure.Step;
import org.example.core.mobile.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PasswordInputPage extends BasePage {

    public PasswordInputPage() {
        super();
    }

    WebElement passwordInput = wait.until(d -> d.findElement(By.id("login_password_field")));

    WebElement doneButton = wait.until(d -> d.findElement(By.id("progressbutton_btn")));

    @Step("sssdasdasd")
    public void passwordInputType(String cardNumber) {
        passwordInput.sendKeys(cardNumber);
    }

    @Step("sdasfdasfasfsafasf")
    public void clickDoneButton() {
        doneButton.click();
    }
}
