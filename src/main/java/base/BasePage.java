package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    private final Properties prop;
    private String url;


    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "/src/main/java/resources/config.properties");
        prop.load(data);
    }

    public String getUrl() {
        url = prop.getProperty("url");
        return url;
    }

    public WebDriver getDriver() {
        //TODO: Add support for running the tests in parallel
        //TODO: Use WebDriverManager to manage the browser/driver versions programmatically
        if (prop.getProperty("browser").equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        //TODO: Add more browsers below

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }


}
