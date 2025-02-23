import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;

public class ReqresInApiTestBase {
    protected static RequestSpecification requestInApiSpec;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://reqres.in/api";
        requestInApiSpec = given() 
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .basePath("/users?");
    }


}
