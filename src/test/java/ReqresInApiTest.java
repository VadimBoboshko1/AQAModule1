


import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresInApiTest extends ReqresInApiTestBase{


    @Test
    public void getUsersWithCode200()  {
        given()
                .basePath("page=2")
                .when().get()
                .then().log().body().statusCode(200);
    }



}
