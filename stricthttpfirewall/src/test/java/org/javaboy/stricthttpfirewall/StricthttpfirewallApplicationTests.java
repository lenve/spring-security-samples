package org.javaboy.stricthttpfirewall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@SpringBootTest
class StricthttpfirewallApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        System.out.println(URLDecoder.decode("%25","UTF-8"));
    }

}
