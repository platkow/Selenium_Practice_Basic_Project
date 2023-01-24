package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ElementsPage extends BasePage {

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Text Box')]")
    private WebElement textBox;
    @FindBy(xpath = "//span[contains(text(),'Check Box')]")
    private WebElement checkBox;
    @FindBy(xpath = "//span[contains(text(),'Radio Button')]")
    private WebElement radioButton;
    @FindBy(xpath = "//span[contains(text(),'Web Tables')]")
    private WebElement webTables;
    @FindBy(xpath = "//span[contains(text(),'Buttons')]")
    private WebElement buttons;
    @FindBy(xpath = "//span[contains(text(),'Links')]")
    private WebElement links;
    @FindBy(xpath = "//span[contains(text(),'Broken Links - Images')]")
    private WebElement brokenLinks;
    @FindBy(xpath = "//span[contains(text(),'Upload and Download')]")
    private WebElement uploadDownload;
    @FindBy(xpath = "//span[contains(text(),'Dynamic Properties')]")
    private WebElement dynamicProperties;


    public TextBox openTextBoxPage(){
        click(textBox);
        return new TextBox(driver);
    }

    public CheckBoxPage openCheckBoxPage(){
        click(checkBox);
        return new CheckBoxPage(driver);
    }

    public RadioButtonsPage openRadioBtnPage(){
        click(radioButton);
        return new RadioButtonsPage(driver);
    }

    public ButtonsPage openButtonsPage(){
        click(buttons);
        return new ButtonsPage(driver);
    }
}
