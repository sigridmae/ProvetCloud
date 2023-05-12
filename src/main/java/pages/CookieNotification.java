package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CookieNotification extends BasePage {

    By acceptButton = By.id("hs-eu-confirmation-button");
    WebDriver driver;
    public CookieNotification(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public WebElement getAcceptButton() {
        return driver.findElement(acceptButton);
    }

}
