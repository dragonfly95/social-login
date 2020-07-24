package com.example.demo;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * 참조블러그
 * https://jojoldu.tistory.com/168
 *
 */
@RunWith(SpringRunner.class)
public class ApplicationTest {

    /**
     * RestAssured 참고블러그
     * https://beenlife.tistory.com/34
     */
    @Before
    public void setup() {
        RestAssured.port = 8080;
    }

    @Test
    public void 기본path로_접근하면_index_html_호출된다 () throws Exception {
        given()
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .contentType("text/html")
                .body(containsString("권한 관리"));
    }
}
