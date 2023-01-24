package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RadioButtonsPage extends BasePage {
    public RadioButtonsPage(WebDriver driver) {
        super(driver);
    }

    String resultMsg = "";

    @FindBy(css = "#yesRadio")
    private WebElement yesRadio;

    @FindBy(css = "#impressiveRadio")
    private WebElement impressiveRadio;

    @FindBy(css = "#noRadio")
    private WebElement noRadio;

    @FindBy(css = ".text-success")
    private WebElement result;

    public RadioButtonsPage selectYesRadioBtn(){
        click(yesRadio, 15, 1);
        return new RadioButtonsPage(driver);
    }

    public RadioButtonsPage selectImpressiveRadioBtn(){
        click(impressiveRadio, 15, 1);
        return new RadioButtonsPage(driver);
    }

    public String getResult(){
        return result.getText();
    }

    public String getFullResultMsg(){
        return resultMsg = resultMsg + getResult();
    }
}
