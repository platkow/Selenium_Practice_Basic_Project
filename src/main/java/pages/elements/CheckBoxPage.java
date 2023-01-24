package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@aria-label='Toggle']")
    private WebElement homeToggle;

    @FindBy(xpath = "//div[@class='react-checkbox-tree rct-icons-fa4']//ol/li[2]//button ")
    private WebElement documentsToggle;

    @FindBy(css = ".rct-checkbox")
    private WebElement homeCbx;

    @FindBy(xpath = "//label[@for='tree-node-documents']/span[1]")
    private WebElement documentsCbx;

    @FindBy(css = "#result")
    private WebElement result;

    public CheckBoxPage expandHome(){
        click(homeToggle);
        return new CheckBoxPage(driver);
    }

    public CheckBoxPage expandDocuments(){
        click(documentsToggle);
        return new CheckBoxPage(driver);
    }

    public void checkHomeCbx(){
        selectCbx(homeCbx);
    }

    public void checkDocumentsCbx(){
        selectCbx(documentsCbx);
    }

    public String getResultText(){
        return result.getText();
    }



}
