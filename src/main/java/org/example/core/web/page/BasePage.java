package org.example.core.web.page;

import org.example.core.web.driver.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class BasePage {

    public BasePage() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean isElementPresent(WebElement element) {
        boolean result;
        try {
            result = element.isDisplayed();
        } catch (NoSuchElementException e) {
            result = false;
        }
        return result;
    }
}
