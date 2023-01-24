package tests.elements;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.MainPage;
import pages.elements.*;
import testbase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ElementsTests extends TestBase {

    private Logger logger = LoggerFactory.getLogger("ElementsTests.class");
    private MainPage mainPage;
    private ElementsPage elementsPage;
    private TextBox textBox;

    private CheckBoxPage checkBoxPage;
    private RadioButtonsPage radioButtonsPage;
    private ButtonsPage buttonsPage;
    private String mainPageUrl = "https://demoqa.com/";

    @BeforeEach
    public void setup() {
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBox = new TextBox(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonsPage = new RadioButtonsPage(driver);
        buttonsPage = new ButtonsPage(driver);
        logger.info("Setting up required page elements complete");
    }

    @Test
    @DisplayName("TextBox")
    public void shouldFillFormAndSubmit() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openTextBoxPage()
                .fillFormAndSubmit(6);

        Assertions.assertTrue(textBox.isOutputDisplayed());
    }

    @Test
    @DisplayName("CheckBox_SelectAll")
    public void shouldExpandOneAndCheckAll() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openCheckBoxPage()
                .expandHome()
                .checkHomeCbx();
        String expectedMsg = "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";

        assertThat(expectedMsg, equalTo(checkBoxPage.getResultText()));
    }

    @Test
    @DisplayName("CheckBox_SelectOne")
    public void shouldExpandOneAndCheckOne() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openCheckBoxPage()
                .expandHome()
                .expandDocuments()
                .checkDocumentsCbx();

        String expectedMsg = "You have selected :\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" + "classified\n" + "general";

        assertThat(expectedMsg, equalTo(checkBoxPage.getResultText()));
    }

    @Test
    @DisplayName("RadioButton_Select_Yes&Impressive")
    @Deprecated
    //more work required
    public void shouldSelectYesAndImpressive() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openRadioBtnPage()
                .selectYesRadioBtn()
                .getResult();
        radioButtonsPage.selectImpressiveRadioBtn()
                .getResult();

        String expectedFullMsg = "YesImpressive";
        assertThat(expectedFullMsg, equalTo(radioButtonsPage.getFullResultMsg()));
    }

    @Test
    @DisplayName("DoubleClickBtn")
    public void shouldDoubleClickBtn() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openButtonsPage()
                .doubleClickOnButton();

        String expectedMsg = "You have done a double click";
        assertThat(expectedMsg, equalTo(buttonsPage.getDoubleClickBtnMsg()));
    }

    @Test
    @DisplayName("RightClickBtn")
    public void shouldRightClickBtn() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openButtonsPage()
                .rightClickOnButton();

        String expectedMsg = "You have done a right click";
        assertThat(expectedMsg, equalTo(buttonsPage.getRightClickBtnMsg()));
    }

    @Test
    @DisplayName("DynamicClickBtn")
    public void shouldDynamicClickBtn() {
        logger.info("---------- Starting test ----------");
        driver.get(mainPageUrl);
        mainPage.openElementsPage()
                .openButtonsPage()
                .dynamicClick();

        String expectedMsg = "You have done a dynamic click";
        assertThat(expectedMsg, equalTo(buttonsPage.getDynamicClickBtnMsg()));
    }

}
