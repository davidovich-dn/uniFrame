package org.example.core.mobile.page;

import io.appium.java_client.MobileElement;
import org.example.core.mobile.driver.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage()
    {
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
