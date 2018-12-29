package guru.springframework.service;

import guru.springframework.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ferenc on 12/28/2018.
 */
@Controller
public class JokeServiceController {
    private final JokeService jokeService;

    @Autowired
    public JokeServiceController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomQuote().getQuote());
        return "chucknorris";
    }

    @GetMapping("/joke")
    @ResponseBody
    public Joke showJoke(){
        return jokeService.getRandomQuote();
    }
}
