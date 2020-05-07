package by.ak.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public")
public class ApiController {

    @GetMapping("movies")
    public String getMovies() {
        return "Test movies";
    }

    @GetMapping("titles")
    public String getTitles() {
        return "Test titles";
    }

}
