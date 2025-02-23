import PageObject.BaseTest1;
import PageObject.ContactSalePage;
import com.codeborne.selenide.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubLoginPageTest extends BaseTest1 {



    @Test
    public void loginOperationWithBadCredentials() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open(LOGIN_PATH);
        gitHubLogInPage.authOperation(BAD_USERNAME, BAD_PASSWORD);
        gitHubLogInPage.IsErrorMassageDisplayed();
    }

    @Test
    public void loginOperationWithGoodCredentials() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open(LOGIN_PATH);
        gitHubLogInPage.authOperation(GOOD_USERNAME, GOOD_PASSWORD);
    }

    @Test
    public void testGitHubContactSales() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open(BASE_URL1);
        SelenideElement buttonSolutions = $(By.xpath(SOLUTIONS_XPATH));
        buttonSolutions.click();
        SelenideElement buttonCICD = $(By.xpath(CICD_XPATH));
        buttonCICD.click();
        SelenideElement buttonContactSales = $(By.xpath(CONTACT_SALES_XPATH));
        buttonContactSales.click();
        ContactSalePage contactSalePage = new ContactSalePage();
        contactSalePage.authOperation2("TestFirstName", "TestLastName");
        contactSalePage.getFirstNameInput().shouldHave(Condition.value("TestFirstName"));
        contactSalePage.getLastNameInput().shouldHave(Condition.value("TestLastName"));
    }

    @Test
    public void checkTopicsValues() {
        open(BASE_URL1);
        SelenideElement buttonResources = $(By.xpath(RESOURCES_BUTTON_XPATH));
        buttonResources.shouldBe(visible).click();
        ElementsCollection topics = $$(By.xpath(".//ul[@aria-labelledby='resources-topics-heading']/li/a"));
        Assertions.assertEquals(topics.texts(), EXPECTED_TOPICS);
    }
}