package org.example.core.web.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {

    private static WebDriver driver;

    private static final Logger LOG = LogManager.getRootLogger();

    private Driver() {}

    synchronized public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private static void setDriver(){
        System.setProperty("webdriver.chrome.driver",
                "/home/dzmitry/IdeaProjects/uniFrame/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        LOG.info("Browser started.");
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
        LOG.info("Browser closed.");
    }
}
