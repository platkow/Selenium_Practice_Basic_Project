package pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import providers.RandomEmailGenerator;
import providers.RandomStringGenerator;

public class TextBox extends BasePage {

    public TextBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#userName")
    private WebElement fullName;
    @FindBy(css = "#userEmail")
    private WebElement email;
    @FindBy(css = "#currentAddress")
    private WebElement currentAddress;
    @FindBy(css = "#permanentAddress")
    private WebElement permanentAddress;
    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(css = "#output")
    private WebElement output;

    public void fillFormAndSubmit(int length){
        sendKeys(fullName, new RandomStringGenerator().generateRandomString(length));
        sendKeys(email, new RandomEmailGenerator().generateRandomEmail(length));
        sendKeys(currentAddress, new RandomStringGenerator().generateRandomString(length));
        sendKeys(permanentAddress, new RandomStringGenerator().generateRandomString(length));
        click(submitBtn);
    }

    public boolean isOutputDisplayed(){
       return output.isDisplayed();
    }

}
