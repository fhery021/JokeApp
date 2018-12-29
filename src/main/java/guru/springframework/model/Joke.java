package guru.springframework.model;

/**
 * Created by Ferenc on 12/28/2018.
 */
public class Joke {
    private String quote;

    public Joke(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
