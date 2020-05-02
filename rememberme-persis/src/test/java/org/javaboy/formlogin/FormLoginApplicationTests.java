package org.javaboy.formlogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootTest
class FormLoginApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        String s = new String(Base64.getDecoder().decode("ZW1ocUFUazNaREJkUjg4NjJXUDRJZyUzRCUzRDpaQUV2NkVJV3FBN0NrR2JZZXdDaDhnJTNEJTNE"), "UTF-8");
        System.out.println("s = " + s);
    }

}
