package com.multi.module.application;

import com.multi.module.library.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.multi.module")
@RestController
public class Main {

    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }

    private final UserService userService;

    public Main(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<String> home() {
        return userService.users();
    }

}
