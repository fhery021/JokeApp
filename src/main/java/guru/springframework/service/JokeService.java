package guru.springframework.service;

import guru.springframework.model.Joke;

/**
 * Created by Ferenc on 12/28/2018.
 */
public interface JokeService {
    Joke getRandomQuote();
}
