package org.javaboy.formlogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootTest
class FormLoginApplicationTests {

    @Test
    void contextLoads() throws UnsupportedEncodingException {
        String s = new String(Base64.getDecoder().decode("amF2YWJveToxNTg5MTA0MDU1MzczOjI1NzhmZmJjMjY0ODVjNTM0YTJlZjkyOWFjMmVmYzQ3"), "UTF-8");
        System.out.println("s = " + s);
    }

}
