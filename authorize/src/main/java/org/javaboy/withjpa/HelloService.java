package org.javaboy.withjpa;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@Service
public class HelloService {
    @PreAuthorize("principal.username.equals('javaboy')")
    public String hello() {
        return "hello";
    }

    @PreAuthorize("hasRole('admin')")
    public String admin() {
        return "admin";
    }

    @Secured({"ROLE_user"})
    public String user() {
        return "user";
    }

    @PreAuthorize("#age>98")
    public String getAge(Integer age) {
        return String.valueOf(age);
    }

    @PostFilter("filterObject.lastIndexOf('2')!=-1")
    public List<String> getAllUser() {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("javaboy:" + i);
        }
        return users;
    }

    @PreFilter(filterTarget = "ages",value = "filterObject%2==0")
    public void getAllAge(List<Integer> ages,List<String> users) {
        System.out.println("ages = " + ages);
        System.out.println("users = " + users);
    }
}
