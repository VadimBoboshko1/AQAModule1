package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHubPage {

    private static final SelenideElement buttonSolutions = $(By.xpath("//li[contains(@class, 'HeaderMenu-item') and contains(@class, 'js-header-menu-item')][contains(., 'Solutions')]"));
    private static final SelenideElement buttonCICD = $(By.xpath("//a[contains(@class, 'HeaderMenu-dropdown-link') and contains(text(), 'CI/CD')]"));
    private static final SelenideElement buttonResources = $(By.xpath("//button[@type='button' and contains(@class, 'HeaderMenu-link') and contains(., 'Resources')]"));

    public void ButtonSolutionsclicked() {
        buttonSolutions.shouldBe(visible).click();
    }

    public void ButtonCICDClicked() {
        buttonCICD.shouldBe(visible).click();
    }

    public void ButtonResourcesClicked() {
        buttonResources.shouldBe(visible).click();
    }
}
