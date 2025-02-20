import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public class BaseAvatarTest {
    protected static RequestSpecification requestAvatarSpec;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://reqres.in/api";
        requestAvatarSpec = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api");
    }
}
