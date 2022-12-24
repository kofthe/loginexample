package mehmetari.loginexample.loginexample.controller;

import mehmetari.loginexample.loginexample.model.Post;
import mehmetari.loginexample.loginexample.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post){
        return post;
    }
}
