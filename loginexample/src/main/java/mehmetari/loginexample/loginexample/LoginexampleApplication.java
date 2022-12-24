package mehmetari.loginexample.loginexample;

import mehmetari.loginexample.loginexample.model.Post;
import mehmetari.loginexample.loginexample.model.User;
import mehmetari.loginexample.loginexample.repository.PostRepository;
import mehmetari.loginexample.loginexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoginexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginexampleApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository, UserRepository userRepository) {
		return args -> {
			userRepository.save(new User("user", "password", "ROLE_USER" ));
			userRepository.save(new User("user", "password", "ROLE_USER, ROLE_ADMIN" ));
			postRepository.save(new Post("Hello", "hello-world", "welcome my blog","Mehmet Arı" ));
		};
	}


}
