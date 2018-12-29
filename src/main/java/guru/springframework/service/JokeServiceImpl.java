package guru.springframework.service;

import guru.springframework.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 12/28/2018.
 */
@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quotes;
    public  JokeServiceImpl(){
        quotes = new ChuckNorrisQuotes();
    }
    @Override
    public Joke getRandomQuote() {
        return new Joke(quotes.getRandomQuote());
    }
}
