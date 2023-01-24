package pages.elements;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class ButtonsPage extends BasePage {
    private Logger logger = LoggerFactory.getLogger("ButtonsPage.class");

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#doubleClickBtn")
    private WebElement doubleClickBtn;

    @FindBy(css = "#rightClickBtn")
    private WebElement rightClickBtn;

    @FindBy(css = "#dynamicClickMessage")
    private WebElement dynamicClickBtn;

    @FindBy(css = "#doubleClickMessage")
    private WebElement doubleClickMsg;

    @FindBy(css = "#rightClickMessage")
    private WebElement rightClickMsg;

    @FindBy(css = "#dynamicClickMessage")
    private WebElement dynamicClickMsg;

    public void doubleClickOnButton() {
        doubleClick(doubleClickBtn);
    }

    public void rightClickOnButton() {
        rightClick(rightClickBtn);
    }

    public void dynamicClick(){
        click(dynamicClickBtn);
    }

    public String getDoubleClickBtnMsg() {
        if (doubleClickMsg.isDisplayed()) {
            return doubleClickMsg.getText();
        } else {
           return waitUntilElementIsVisible(15, doubleClickMsg).getText();
        }
    }

        public String getRightClickBtnMsg() {
            if (rightClickMsg.isDisplayed()) {
                return rightClickMsg.getText();
            } else {
                return waitUntilElementIsVisible(20, rightClickMsg).getText();
            }
        }

    public String getDynamicClickBtnMsg() {
        if (dynamicClickMsg.isDisplayed()) {
            return doubleClickMsg.getText();
        } else {
            return waitUntilElementIsVisible(30, dynamicClickMsg).getText();
        }
    }
}
