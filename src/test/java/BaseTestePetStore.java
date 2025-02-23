import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BaseTestePetStore {
    protected static RequestSpecification requestSpec;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        requestSpec = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .basePath("/pet");
    }

}


