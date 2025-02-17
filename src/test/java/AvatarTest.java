import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.GetAvatar;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AvatarTest {
    @Test
    public void chekUsersAvatar() {
        List<GetAvatar> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/users")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetAvatar.class);
        for (GetAvatar user : users) {
            assertTrue(user.getAvatar().contains("https://reqres.in"),"Avatar URL is incorrect for user: " + user.getAvatar());
        }
    }
}
