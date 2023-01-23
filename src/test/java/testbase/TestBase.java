package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    private WebDriver driver;
    private Logger logger = LoggerFactory.getLogger("TestBase.class");

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        logger.info("-------------------------- Setup driver complete --------------------------");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        logger.info("-------------------------- Driver quit complete --------------------------");
    }
}
