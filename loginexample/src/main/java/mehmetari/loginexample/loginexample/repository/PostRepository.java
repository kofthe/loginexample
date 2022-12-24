package mehmetari.loginexample.loginexample.repository;

import mehmetari.loginexample.loginexample.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
