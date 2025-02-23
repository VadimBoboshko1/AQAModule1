package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CICDpage {

    private static final SelenideElement buttonContactSales = $(By.xpath("//a[@href='https://github.com/enterprise/contact?ref_cta=Contact+sales&ref_loc=hero&ref_page=%2Fsolutions_usecase_cicd']"));

    public static void ButtonContactSalesClicked() {
        buttonContactSales.shouldBe(visible).click();
    }
}
