
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApiTestPetStore extends BaseTestePetStore{

    @Test
    public void GetUserWithId4() {
        given()
                .spec(requestSpec)
                .when().get("/4")
                .then().statusCode(200)
                .body("id", equalTo(4));


    }


    @Test
    public void DeleteUserWithId4() {
        given()
                .spec(requestSpec)
                .when().delete("/4")
                .then().statusCode(200)
                .body("message", equalTo(4));
    }

    @Test
    public void UnauthorizedAccetTest() {
        given()
                .auth().preemptive().basic("petstore", "petstore")
                .when().delete("/4")
                .then().statusCode(401);
    }

}




