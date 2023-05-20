import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MavenTest {
    public static void main(String[] args) {
        try {
            System.out.println("Ecco il codice HTML di Google che sarà stampato in console");
            System.out.println(Unirest.get("https://www.google.com").asString().getBody());
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }

    }
}
