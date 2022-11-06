package org.example.core.mobile.page.outerPages;

import io.qameta.allure.Step;
import org.example.core.mobile.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends BasePage {

    WebElement loginButton = wait.until(d -> d.findElement(By.id("welcome_loginbutton")));


    public WelcomePage() {
        super();
    }

    @Step("Click Login button on the Welcome page.")
    public void clickLoginButton() {
        loginButton.click();
    }
}
