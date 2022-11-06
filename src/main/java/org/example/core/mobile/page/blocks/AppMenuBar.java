package org.example.core.mobile.page.blocks;

import io.qameta.allure.Step;
import org.example.core.mobile.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppMenuBar extends BasePage {

    WebElement aktuellItem = wait.until(d -> d.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Aktuell']/android.widget.FrameLayout")));
    WebElement couponsItem = wait.until(d -> d.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='Coupons']/android.widget.FrameLayout")));
//    WebElement karteAndPayItem = wait.until(d -> d.findElement(By.id("login_password_field")));
//    WebElement onlineShopsItem = wait.until(d -> d.findElement(By.id("login_password_field")));
//    WebElement servicesItem = wait.until(d -> d.findElement(By.id("login_password_field")));

    public AppMenuBar() {
        super();
    }

    @Step("dsfsdfsdfsdfdf")
    public void clickCouponsItem() {
        couponsItem.click();
    }
}
