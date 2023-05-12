package tests;

import base.Hooks;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DemoPage;

import java.io.IOException;

public class RequestDemoTest extends Hooks {

    DemoPage demoPage;
    String firstName = "First";
    String lastName = "Last";
    String company = "Some company";
    String job = "Some job";
    String email = "sigridmae@gmail.com";
    String phone = "12312313";
    String country = "Germany";
    public RequestDemoTest() throws IOException {
        super();
    }

    @Test
    public void verifyFillFormData() throws IOException {
        demoPage = new DemoPage(driver);
        demoPage.getFirstName().sendKeys(firstName);
        demoPage.getLastName().sendKeys(lastName);
        demoPage.getClinicName().sendKeys(company);
        demoPage.getJobTitle().sendKeys(job);
        demoPage.getEmail().sendKeys(email);
        demoPage.getPhoneNumber().sendKeys(phone);
        demoPage.getCountry().sendKeys(country);
        demoPage.getConsentField().click();
        Assert.assertEquals(demoPage.getFirstName().getAttribute("value"), firstName);
        Assert.assertEquals(demoPage.getLastName().getAttribute("value"), lastName);
        Assert.assertEquals(demoPage.getClinicName().getAttribute("value"), company);
        Assert.assertEquals(demoPage.getJobTitle().getAttribute("value"), job);
        Assert.assertEquals(demoPage.getEmail().getAttribute("value"), email);
        Assert.assertEquals(demoPage.getPhoneNumber().getAttribute("value"), phone);
        Assert.assertEquals(demoPage.getCountry().getAttribute("value"), country);
        Assert.assertTrue(demoPage.getConsentField().isEnabled());
        //Captcha is enabled
        //demoPage.getSubmitButton().click();
    }
    @Test
    public void verifyInvalidEmail() throws IOException {
        demoPage = new DemoPage(driver);
        driver.navigate().refresh();
        demoPage.getEmail().sendKeys("asdasdad");
        Assert.assertEquals(demoPage.getEmailError().getText(), "Email must be formatted correctly.");
    }

    @Test
    public void verifyAllEmptyFields() throws IOException {
        demoPage = new DemoPage(driver);
        driver.navigate().refresh();
        demoPage.getSubmitButton().click();
        Assert.assertEquals(demoPage.getAllFieldsError().getText(), "Please complete all required fields.");
    }

    @Test
    public void verifyFieldError() throws Exception {
        demoPage = new DemoPage(driver);
        driver.navigate().refresh();
        demoPage.getSubmitButton().click();
        //TODO: Verify all field errors
        Assert.assertEquals(demoPage.getFieldError(demoPage.getFirstName()).getText(), "Please complete this required field.");
    }



}
