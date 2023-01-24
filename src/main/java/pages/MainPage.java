package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.ElementsPage;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][1]")
    private WebElement elements;

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][2]")
    private WebElement forms;

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][3]")
    private WebElement alertsFrameWindows;

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][4]")
    private WebElement widgets;

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][5]")
    private WebElement interactions;

    @FindBy(xpath = "//div[@class='category-cards']//div[@class='card mt-4 top-card'][6]")
    private WebElement bookStoreApplication;

    public ElementsPage openElementsPage() {
        click(elements);
        return new ElementsPage(driver);
    }

    public ElementsPage openFormsPage() {
        click(forms);
        return new ElementsPage(driver);
    }

    public ElementsPage openAlertsFramesWindowsPage() {
        click(alertsFrameWindows);
        return new ElementsPage(driver);
    }

    public ElementsPage openWidgetsPage() {
        click(widgets);
        return new ElementsPage(driver);
    }

    public ElementsPage openInteractionsPage() {
        click(interactions);
        return new ElementsPage(driver);
    }

    public ElementsPage openBookStoreApplicationPage() {
        click(bookStoreApplication);
        return new ElementsPage(driver);
    }
}
