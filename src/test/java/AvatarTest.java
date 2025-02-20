import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import pojo.GetAvatar;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AvatarTest extends BaseAvatarTest {


    private static final String base_uri = "https://reqres.in/api";
    private static final String base_path = "/users";
    private static final String avatar_url_prefix = "https://reqres.in";

    @Test
    public void checkUsersAvatar() {

        List<GetAvatar> users = given()
                .spec(requestAvatarSpec)
                .basePath(base_path)  // Используем константу для basePath
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetAvatar.class);


        for (GetAvatar user : users) {
            assertTrue(user.getAvatar().contains(avatar_url_prefix),
                    "Avatar URL is incorrect for user: " + user.getAvatar());
        }
    }
}