package miniTwitter.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import miniTwitter.demo.models.Post;
import miniTwitter.demo.models.User;
import miniTwitter.demo.repositories.PostRepository;
import miniTwitter.demo.repositories.UserRepository;
import miniTwitter.demo.services.UserService;
import miniTwitter.demo.validators.UserValidator;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

@Controller
public class PostController {

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private UserService userService;
  
    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private PostRepository postRepository;


    
    @RequestMapping(value="/newsfeed", method = RequestMethod.GET)
    public String getPostForm(Model m, Principal p){
    	
    	m.addAttribute("allPosts",postRepository.findAll());
    	return "newsfeed";
    	
    }
    
    @RequestMapping(value="/savepost", method = RequestMethod.POST)
    public String savePost(String content,  Principal p, Model m){
    	Post post = new Post();
    	post.setContent(content);
    	post.setPostedBy(userRepository.findByEmail(p.getName()));
    	post.setPostedDate(new Date());
    	postRepository.save(post);
    	m.addAttribute("allPosts",postRepository.findAll());
    	return "newsfeed";
    }
    
    @RequestMapping(value="/post/{id}", method = RequestMethod.GET)
    public String savePost(@PathVariable Long id,  Principal p, Model m){
    	List<Post> post = postRepository.findByPostedBy_Id(id);
    	m.addAttribute("allPosts",post);
    	return "tweet";
    }
    
    }