package PageObject;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest1 {
    @BeforeAll
    public static void SetConfiguration(){
        Configuration.baseUrl = "https://github.com";
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
