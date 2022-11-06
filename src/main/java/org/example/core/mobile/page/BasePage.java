package org.example.core.mobile.page;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.example.core.mobile.driver.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected MobileDriver driver = DriverManager.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 30);

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public boolean isElementPresent(MobileElement element) {
        boolean result;
        try {
            result = element.isDisplayed();
        } catch (NoSuchElementException e) {
            result = false;
        }
        return result;
    }
}
