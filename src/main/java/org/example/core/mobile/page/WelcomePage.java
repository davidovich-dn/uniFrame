package org.example.core.mobile.page;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.example.core.mobile.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage extends BasePage {

    MobileDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);
//    WebElement loginButton = driver.findElement(By.id("android:id/welcome_loginbutton"));
    WebElement loginButton = wait.until(d -> d.findElement(By.id("welcome_loginbutton")));


    public WelcomePage() {
        super();
    }

    @Step("Click Login button on the Welcome page.")
    public void clickLoginButton() {
        loginButton.click();
    }
}
