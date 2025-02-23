import pojo.GetUsersData;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReqresColorTest extends BaseReqresColorTest{
    @Test
    public void checkUsersColors() {
        List<GetUsersData> colors = given()
                .spec(requestColorSpec)
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        for (GetUsersData color : colors) {
            assertTrue(color.getYear() >= 2000, "Year is less than 2000 for color " + color.getName());
        }


    }
}
