import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;


import static org.hamcrest.Matchers.equalTo;

    public class test {
    @Nested
    class PostmanEchoTest {

        @Test
        void checkingPOSTRequest() {
            given()
                    .baseUri("https://postman-echo.com")
                    .body("Look") // отправляемые данные

                    // Выполняемые действия
                    .when().log().all()
                    .post("/post")

                    // Проверки
                    .then().log().all()
                    .statusCode(200)
                    .body("data", equalTo("Look"))
            ;
        }
    }
}
