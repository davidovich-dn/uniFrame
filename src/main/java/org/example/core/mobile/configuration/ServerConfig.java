package org.example.core.mobile.configuration;

import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {

    @Key("env.type")
    String environment();

    @Key("app.path")
    String appPath();

    @Key("app.package")
    String appPackage();

    @Key("app.activity")
    String appActivity();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("local.device.name")
    String deviceName();

    @Key("udid")
    String udid();

    @Key("appium.address")
    String appiumAddress();

    @Key("appium.port")
    String appiumPort();
}
