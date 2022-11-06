package org.example.core.mobile.page;

import io.appium.java_client.MobileDriver;
import org.example.core.mobile.driver.DriverManager;
import org.example.core.mobile.page.blocks.AppMenuBar;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    MobileDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    private AppMenuBar appMenuBar = new AppMenuBar();

    public MainPage () {
        super();
    }

    //todo: perform click by coordinates to hide popup
}
