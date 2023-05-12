package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.CookieNotification;

import java.io.IOException;

public class Hooks extends BasePage {

    public Hooks() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
        //Close cookie notification
        CookieNotification notification = new CookieNotification(driver);
        notification.getAcceptButton().click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
