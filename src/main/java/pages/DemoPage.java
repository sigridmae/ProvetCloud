package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class DemoPage extends BasePage {

    WebDriver driver;

    public DemoPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By company = By.name("company");
    By phone = By.name("phone");
    By job = By.name("jobtitle");
    By country = By.name("country__dropdown_");
    By consent = By.xpath("//input[contains(@id,'LEGAL')]");
    By submit = By.xpath("//input[@value='Submit']");
    By emailError = By.xpath("//label[@class='hs-error-msg hs-main-font-element']");

    By allErrorMessage = By.xpath("//*[@class='hs_error_rollup']");

    String fieldErrorMessagePath = "/..//..//label[contains(@class, 'hs-error-msg')]";

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }
    public WebElement getEmail() {
        return driver.findElement(email);
    }
    public WebElement getClinicName() {
        return driver.findElement(company);
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(phone);
    }

    public WebElement getJobTitle() {
        return driver.findElement(job);
    }

    public WebElement getCountry() {
        return driver.findElement(country);
    }

    public WebElement getConsentField() {
        return driver.findElement(consent);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submit);
    }

    public WebElement getEmailError() {
        return driver.findElement(emailError);
    }

    public WebElement getAllFieldsError() {
        return driver.findElement(allErrorMessage);
    }

    public  WebElement getFieldError(WebElement element) {
        System.out.println("//*[@name='" + element.getAttribute("name") + fieldErrorMessagePath);
        return driver.findElement(By.xpath("//*[@name='" + element.getAttribute("name") + "']" + fieldErrorMessagePath));
    }

}
