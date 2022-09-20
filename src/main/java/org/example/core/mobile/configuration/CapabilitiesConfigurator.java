package org.example.core.mobile.configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.APP;
import static io.appium.java_client.remote.MobileCapabilityType.UDID;

public class CapabilitiesConfigurator {

    private CapabilitiesConfigurator() {
    }
//    TODO: implement capability settings using Owner API
//    static ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    public static DesiredCapabilities getLocalCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(UDID, ConfigurationReader.get().udid());
        capabilities.setCapability(AVD, ConfigurationReader.get().localDeviceName());
        capabilities.setCapability(APP_PACKAGE, ConfigurationReader.get().appPackage());
        capabilities.setCapability(APP_ACTIVITY, ConfigurationReader.get().appActivity());
        capabilities.setCapability(APP, new File(ConfigurationReader.get().appPath()).getAbsolutePath());

//        capabilities.setCapability(UDID, cfg.udid());
//        capabilities.setCapability(AVD, cfg.deviceName());
//        capabilities.setCapability(APP_PACKAGE, cfg.appPackage());
//        capabilities.setCapability(APP_ACTIVITY, cfg.appActivity());
//        capabilities.setCapability(APP, new File(cfg.appPath()).getAbsolutePath());
        return capabilities;
    }
}
