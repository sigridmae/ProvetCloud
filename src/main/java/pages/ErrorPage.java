package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ErrorPage extends BasePage {

    WebDriver driver;

    By title = By.xpath("//h1[@class='hero--title']");
    By description = By.xpath("//*[@class='hero--title']");

    public ErrorPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public WebElement getDescription() {
        return driver.findElement(description);
    }
}
