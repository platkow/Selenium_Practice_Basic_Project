package waits;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }


//    public WebElement waitTillElementIsClickable(WebElement element, int timeout, int pooling){
//        WebDriverWait fluentWait = (WebDriverWait) new FluentWait(this.driver);
//        fluentWait.withTimeout(Duration.ofSeconds(timeout))
//                .pollingEvery(Duration.ofSeconds(pooling))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement clickableElement = (WebElement) fluentWait.until(ExpectedConditions.elementToBeClickable(element));
//        return clickableElement;
//    }
}
