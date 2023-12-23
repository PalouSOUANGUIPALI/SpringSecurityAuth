package com.drawyourcom.springbootwithsecurityauth;

import com.drawyourcom.springbootwithsecurityauth.controllers.LoginController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringBootAppWithSecurityAuthApplicationTests {
    @Autowired
    LoginController loginController;

    @Test
    void contextLoads() {
        assertThat(loginController).isNotNull();
    }

}
