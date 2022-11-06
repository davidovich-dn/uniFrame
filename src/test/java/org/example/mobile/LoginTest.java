package org.example.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Feature;
import org.example.core.mobile.driver.DriverManager;
import org.example.core.mobile.page.innerPages.MainPage;
import org.example.core.mobile.page.outerPages.CardNumberInputPage;
import org.example.core.mobile.page.outerPages.PasswordInputPage;
import org.example.core.mobile.page.outerPages.WelcomePage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Login test")
    @Feature("Login")
    public void loginTest() {
        new WelcomePage().clickLoginButton();
        new CardNumberInputPage().cardNumberType("4043233556");
//        need a vpn to proceed, or we have an error message
        new CardNumberInputPage().clickNextButton();
        new PasswordInputPage().passwordInputType("mytestaccount1082");
        new PasswordInputPage().clickDoneButton();
    }

    @Test(dependsOnMethods = "loginTest")
    public void filterCouponsByPartnerTest() throws InterruptedException {
        AppiumDriver<MobileElement> driver = DriverManager.getDriver();

        new MainPage().clickAppMenuBarCouponsItem();
        Thread.sleep(10000);
    }
}
