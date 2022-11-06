package org.example.mobile;

import org.example.core.common.utils.TestListener;
import org.example.core.mobile.driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class BaseTest {

    @BeforeClass
    public void createSession() {
        DriverManager.getDriver();
    }

//    @AfterMethod
//    public void resetApp() {
//        DriverManager.getDriver().resetApp();
//    }

    @AfterClass
    public void closeSession() {
        DriverManager.closeDriver();
        DriverManager.closeAppium();
        DriverManager.closeEmulator();
    }
}
