package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHubPage {

    private static final SelenideElement buttonSolutions = $(By.xpath("//button[normalize-space(text())='Solutions']"));
    private static final SelenideElement buttonCICD = $(By.xpath("//a[contains(@data-analytics-event, 'ci_cd')]"));
    private static final SelenideElement buttonResources = $(By.xpath("//button[normalize-space(text())='Resources']"));

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
