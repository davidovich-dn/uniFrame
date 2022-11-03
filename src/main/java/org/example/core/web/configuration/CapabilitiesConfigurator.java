package org.example.core.web.configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesConfigurator {

    private CapabilitiesConfigurator() {
    }
//    TODO: implement capability settings using Owner API
//    static ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    public static DesiredCapabilities getLocalCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("76.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }
}
