package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    protected WebDriver driver = new ChromeDriver();
    private Logger logger = LoggerFactory.getLogger("TestBase.class");

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        logger.info("-------------------------- Setup driver complete --------------------------");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        logger.info("---------- Ending test ----------");
        logger.info("-------------------------- Driver quit complete --------------------------");
    }
}
