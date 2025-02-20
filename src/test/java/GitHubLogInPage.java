import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHubLogInPage {

    private static final SelenideElement userNameInput = $(By.id("login_field"));
    private static final SelenideElement passwordInput = $(By.id("password"));
    private static final SelenideElement buttonSignIn = $(By.xpath("//input[contains(@class, 'btn-primary')]"));
    private static final SelenideElement invalidCredErrorMessege = $(By.id("js-flash-container"));
    private static final SelenideElement firstNameInput = $(By.id("form-field-first_name"));


    public void authOperation(String login, String password) {
        SetUserName(login);
        SetPassword(password);
        PushSubmitButton();
    }

    public void SetUserName(String login) {
        userNameInput.shouldBe(visible).setValue(login);
    }

    public void SetPassword(String password) {
        passwordInput.shouldBe(visible).setValue(password);
    }

    public void PushSubmitButton() {
        buttonSignIn.shouldBe(visible).click();
    }

    public void IsErrorMassageDisplayed() {
        invalidCredErrorMessege.shouldBe(visible);
    }

    public static void FirstNameClicked() {
        firstNameInput.shouldBe(visible).click();
    }

}



