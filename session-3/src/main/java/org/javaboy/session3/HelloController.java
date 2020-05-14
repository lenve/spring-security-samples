package org.javaboy.session3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @作者 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(HttpServletRequest req) {
        HttpSession session = req.getSession(true);
        String name = (String) session.getAttribute("name");
        if (name == null || "".equals(name)) {
            session.setAttribute("name", "javaboy");
            System.out.println("set session");
        }
        System.out.println("name = " + name);
        System.out.println(session==null?session:session.getId());
    }
}
