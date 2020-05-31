package by.ak.securitydemo.controller;

import by.ak.securitydemo.db.UserRepository;
import by.ak.securitydemo.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
@CrossOrigin
public class ApiController {

    private UserRepository userRepository;

    public ApiController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("movies")
    public String getMovies() {
        return "Test movies";
    }

    @GetMapping("titles")
    public String getTitles() {
        return "Test titles";
    }

    @GetMapping("users")
    public List<User> users() {
        return userRepository.findAll();
    }

}
