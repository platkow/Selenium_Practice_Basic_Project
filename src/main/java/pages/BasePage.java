package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import waits.Waits;

import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    private Logger logger = LoggerFactory.getLogger("BasePage.class");

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        logger.info("Before clicking on element " + element.getText());
        element.click();
        logger.info("Element clicked");
    }

    public void click(WebElement element, int timeout, int pooling) {
        logger.info("Before clicking on clickable element ");
        waitTillElementIsClickable(element, timeout, pooling);
        logger.info("Element clicked");
    }

    public void doubleClick(WebElement element) {
        logger.info("Before double clicking on element " + element.getText());
        Actions actions = new Actions(driver);
        Action doubleClick = actions.doubleClick(element).build();
        doubleClick.perform();
        logger.info("Element double clicked");
    }

    public void rightClick(WebElement element) {
        logger.info("Before right clicking on element " + element.getText());
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
        logger.info("Element right clicked");
    }



    public void sendKeys(WebElement element, String text) {
        logger.info("Before clearing and sending text to element " + element.getText());
        element.clear();
        element.sendKeys(text);
        logger.info("Sending text: " + text + " to element " + element.getText());
    }

    public void selectCbx(WebElement element){
        if(!element.isSelected()){
            logger.info("Before selecting element: " + element.getText());
            element.click();
            logger.info("Element selected");
        } else {
            logger.info("Element already selected");
        }
    }

    public WebElement waitTillElementIsClickable(WebElement element, int timeout, int pooling){
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pooling))
                .ignoring(NoSuchElementException.class);

        WebElement clickableElement = (WebElement) fluentWait.until(ExpectedConditions.elementToBeClickable(element));
        return clickableElement;
    }

    public WebElement waitUntilElementIsVisible(int timeout, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
        return visibleElement;
    }

}
