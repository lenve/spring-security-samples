package org.javaboy.httpbasic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootTest
class HttpbasicApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        String x = new String(Base64.getDecoder().decode("MTU5MTE5NzI1MjUwMDo2NWE4NWVkYTVlMDNlY2JjODRmYTJhMDFjNGUwMWU4Yw=="), "UTF-8");
        System.out.println(x);
    }

}
