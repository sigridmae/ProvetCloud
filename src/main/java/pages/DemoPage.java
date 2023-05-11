package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class DemoPage extends BasePage {

    WebDriver driver;

    public DemoPage(WebDriver driver) throws IOException {
        super();
    }

    By firstName = By.name("firstname");
    By lastName = By.name("lastName");

    public WebElement getFirstName() throws IOException {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() throws IOException {
        return driver.findElement(lastName);
    }

}
