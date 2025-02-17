import pojo.GetUsersData;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReqresColorTest {
    @Test
    public void checkUsersColors() {
        List<GetUsersData> colors = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        for (GetUsersData color : colors) {
            assertTrue(color.getYear() >= 2000, "Year is less than 2000 for color " + color.getName());
        }


    }
}
