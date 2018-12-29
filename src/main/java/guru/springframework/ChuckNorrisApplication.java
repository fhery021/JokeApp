package guru.springframework;

import guru.springframework.service.JokeServiceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisApplication.class, args);
	}

}

