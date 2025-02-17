package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ContactSalePage {

    private static final SelenideElement firstNameInput = $(By.id("form-field-first_name"));
    private static final SelenideElement lastNameInput = $(By.id("form-field-last_name"));

    public static void authOperation2(String firstName, String lastName) {
        setFirstNameInput(firstName);
        setLastNameInput(lastName);
    }


    public static void setFirstNameInput(String firstName) {
        firstNameInput.shouldBe(visible).setValue(firstName);
    }

    public static void setLastNameInput(String lastName) {
        lastNameInput.shouldBe(visible).setValue(lastName);
    }

    public static SelenideElement getFirstNameInput() {
        return firstNameInput;
    }
    public static SelenideElement getLastNameInput() {
        return lastNameInput;
    }

}

