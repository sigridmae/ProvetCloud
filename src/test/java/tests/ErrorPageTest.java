package tests;

import base.BasePage;
import base.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ErrorPage;


import java.io.IOException;

public class ErrorPageTest extends Hooks {

    public ErrorPageTest() throws IOException {
        super();
    }

    @Test
    public void checkTitle() throws IOException {
        ErrorPage page = new ErrorPage(driver);
        Assert.assertEquals(page.getTitle().getText(), "Page not found!");
    }

    @Test
    public void checkDescription() throws IOException {
        ErrorPage page = new ErrorPage(driver);
        Assert.assertTrue(page.getDescription().isDisplayed());
    }







}
