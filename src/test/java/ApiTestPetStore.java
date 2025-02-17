import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApiTestPetStore {

    @Test
    public void GetUserWithId4() {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when().get("/pet/4")
                .then().statusCode(200)
                .body("id", equalTo(4));


    }


    @Test
    public void DeleteUserWithId4() {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when().delete("/pet/4")
                .then().statusCode(200)
                .body("message", equalTo(4));
    }

    @Test
    public void UnauthorizedAccetTest() {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .auth().preemptive().basic("petstore", "petstore")
                .when().delete("/pet/4")
                .then().statusCode(401);
    }

}




