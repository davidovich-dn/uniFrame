package org.example.core.mobile.page;

import io.appium.java_client.MobileDriver;
import io.qameta.allure.Step;
import org.example.core.mobile.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordInputPage extends BasePage {

    MobileDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

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
