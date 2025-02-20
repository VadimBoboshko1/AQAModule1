import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public class BaseReqresColorTest {
    protected static RequestSpecification requestColorSpec;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://reqres.in/api";
        requestColorSpec = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown");
    }
}
