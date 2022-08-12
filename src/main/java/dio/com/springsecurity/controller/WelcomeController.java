package dio.com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {
    @GetMapping
    public String welcome() { return "Welcome to my Spring Boot WEb API";}
    @GetMapping("/users")
    public String users() { return  "Authorized user";}
    @GetMapping("/manegers")
    public String managers() { return "Authorized manager";}
}
