package org.javaboy.withjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return helloService.admin();
    }

    @GetMapping("/user/hello")
    public String user() {
        return helloService.user();
    }

    @GetMapping("/age")
    public String getAge(Integer age) {
        return helloService.getAge(age);
    }

    @GetMapping("/users")
    public List<String> getAllUsers() {
        return helloService.getAllUser();
    }

    @GetMapping("/ages")
    public void getAllAges() {
        List<Integer> ages = new ArrayList<>();
        List<String> users = new ArrayList<>();
        ages.add(98);
        ages.add(99);
        ages.add(100);
        users.add("javaboy");
        users.add("江南一点雨");
        helloService.getAllAge(ages, users);
    }
}
