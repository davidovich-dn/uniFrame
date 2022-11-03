package org.example.core.web.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.web.configuration.CapabilitiesConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class Driver {

    private static WebDriver driver;

    private static final Logger LOG = LogManager.getRootLogger();

    private Driver() {}

    synchronized public static WebDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

    private static void setDriver() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver",
                "/home/dzmitry/IdeaProjects/uniFrame/src/main/resources/chromedriver");
        driver = new ChromeDriver();

//        driver = new RemoteWebDriver(
//                URI.create("http://localhost:4444/").toURL(),
//                CapabilitiesConfigurator.getLocalCapabilities());

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        LOG.info("Browser started.");
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
        LOG.info("Browser closed.");
    }
}
