package com.multi.module.library;

import com.multi.module.library.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootApplication
class UserServiceTest {

    @Autowired
    private UserService myService;

    @Test
    public void contextLoads() {
        Assertions.assertNotNull(myService.users());
    }

}