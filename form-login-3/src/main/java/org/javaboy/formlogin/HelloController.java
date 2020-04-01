package org.javaboy.formlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
    @RequestMapping("/hello2")
    public String hello2() {
        return "hello2";
    }

    @RequestMapping("/f1")
    public String f1() {
        return "f1";
    }
    @RequestMapping("/f2")
    public String f2() {
        return "f2";
    }
}
