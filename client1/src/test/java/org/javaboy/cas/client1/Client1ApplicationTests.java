package org.javaboy.cas.client1;

import org.javaboy.cas.client1.config.CasSecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Client1ApplicationTests {

    @Autowired
    CasSecurityConfig casSecurityConfig;
    @Test
    void contextLoads() {
        System.out.println(casSecurityConfig);
    }

}
