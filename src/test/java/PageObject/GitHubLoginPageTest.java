package PageObject;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubLoginPageTest extends BaseTest1 {

    @Test
    public void LoginOperationWithBadCredentials() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open("/login");
        gitHubLogInPage.authOperation("Test@yandex.ru", "12345678");
        gitHubLogInPage.IsErrorMassageDisplayed();

    }

    @Test
    public void LoginOperationWithGoodCredentials() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open("/login");
        gitHubLogInPage.authOperation("VadimBoboshko1", "Sofiaxpress95!");

    }


    @Test
    public void testGitHubContactSales() {
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        open("");
        SelenideElement ButtonSolutions = $(By.xpath("//li[contains(@class, 'HeaderMenu-item') and contains(@class, 'js-header-menu-item')][contains(., 'Solutions')]"));
        ButtonSolutions.click();
        SelenideElement ButtonCICD = $(By.xpath("//a[contains(@class, 'HeaderMenu-dropdown-link') and contains(text(), 'CI/CD')]"));
        ButtonCICD.click();
        SelenideElement ButtonContactSales = $(By.xpath("//a[@href='https://github.com/enterprise/contact?ref_cta=Contact+sales&ref_loc=hero&ref_page=%2Fsolutions_usecase_cicd']"));
        ButtonContactSales.click();
        ContactSalePage contactSalePage = new ContactSalePage();
        contactSalePage.authOperation2("TestFirstName", "TestLastName");
        contactSalePage.getFirstNameInput().shouldHave(Condition.value("TestFirstName"));
        contactSalePage.getLastNameInput().shouldHave(Condition.value("TestLastName"));


    }

    @Test
    public void checkTopicsValues() {
        open("");
        GitHubLogInPage gitHubLogInPage = new GitHubLogInPage();
        SelenideElement ButtonResources = $(By.xpath("//button[@type='button' and contains(@class, 'HeaderMenu-link') and contains(., 'Resources')]"));
        ButtonResources.shouldBe(visible).click();
        ElementsCollection topics = $$(By.xpath(".//ul[@aria-labelledby='resources-topics-heading']/li/a"));
        List<String> expectedTopics = List.of("AI", "DevOps", "Security", "Software Development", "View all");
        Assertions.assertEquals(topics.texts(), expectedTopics);

    }
}







