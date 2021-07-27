package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {
    private PostRepository postRepository;
    public BlogController(PostRepository post){
        this.postRepository = post;
    }
    @RequestMapping("/")
    public String listPosts(ModelMap model) {
        List<Post> allPosts = postRepository.getAllPosts();
        model.put("title", "Blog Post 1");
        model.put("posts",allPosts);
        return "home";
    }
}
