package com.multi.module.library;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Value("${project.name}")
    private String messageDefault;

    public UserService() {
        System.out.println("Constructor=%s, UserService=%s".formatted(messageDefault, LocalDateTime.now()));
    }

    public List<String> users() {
        return List.of("USER-1", "USER-2");
    }

}
