package PageObject;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;

public class BaseTest1 {


    private static final String BASE_URL = "https://github.com";
    private static final String BROWSER = "chrome";
    private static final boolean SCREENSHOTS_ENABLED = false;
    private static final boolean SAVE_PAGE_SOURCE = false;



    protected static final String BASE_URL1 = "https://github.com";
    protected static final String LOGIN_PATH = "/login";
    protected static final String SOLUTIONS_XPATH = "//li[contains(@class, 'HeaderMenu-item') and contains(@class, 'js-header-menu-item')][contains(., 'Solutions')]";
    protected static final String CICD_XPATH = "//a[contains(@class, 'HeaderMenu-dropdown-link') and contains(text(), 'CI/CD')]";
    protected static final String CONTACT_SALES_XPATH = "//a[@href='https://github.com/enterprise/contact?ref_cta=Contact+sales&ref_loc=hero&ref_page=%2Fsolutions_usecase_cicd']";
    protected static final String RESOURCES_BUTTON_XPATH = "//button[@type='button' and contains(@class, 'HeaderMenu-link') and contains(., 'Resources')]";
    protected static final List<String> EXPECTED_TOPICS = List.of("AI", "DevOps", "Security", "Software Development", "View all");


    protected static final String BAD_USERNAME = "Test@yandex.ru";
    protected static final String BAD_PASSWORD = "12345678";
    protected static final String GOOD_USERNAME = "VadimBoboshko1";
    protected static final String GOOD_PASSWORD = "Sofiaxpress95!";


    @BeforeAll
    public static void SetConfiguration() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = BROWSER;
        Configuration.screenshots = SCREENSHOTS_ENABLED;
        Configuration.savePageSource = SAVE_PAGE_SOURCE;
    }
}
