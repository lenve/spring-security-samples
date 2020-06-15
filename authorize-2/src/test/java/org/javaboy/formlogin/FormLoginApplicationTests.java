package org.javaboy.formlogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class FormLoginApplicationTests {

    @Test
    void contextLoads() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        encoders.put("MD5", new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("MD5"));
        encoders.put("noop", org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance());
        DelegatingPasswordEncoder encoder1 = new DelegatingPasswordEncoder("bcrypt", encoders);
        DelegatingPasswordEncoder encoder2 = new DelegatingPasswordEncoder("MD5", encoders);
        DelegatingPasswordEncoder encoder3 = new DelegatingPasswordEncoder("noop", encoders);
        String e1 = encoder1.encode("123");
        String e2 = encoder2.encode("123");
        String e3 = encoder3.encode("123");
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
    }

}
