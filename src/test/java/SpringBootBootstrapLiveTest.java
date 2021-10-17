import com.envelopes.production.domain.Envelope;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.http.MediaType;

import java.awt.print.Book;

public class SpringBootBootstrapLiveTest {

    private static final String API_ROOT
            = "http://localhost:8081/api/books";

    private Envelope createRandomBook() {
        Envelope envelope = new Envelope();
        Envelope.setName("Bob");
        Envelope.setType("General");
        return envelope;
    }

    private String createBookAsUri(Book book) {
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(envelope)
                .post(API_ROOT);
        return API_ROOT + "/" + response.jsonPath().get("id");
    }
}
