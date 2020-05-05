package org.javaboy.formlogin.config;

import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Component
public class MyWebAuthenticationDetailsSource implements AuthenticationDetailsSource<HttpServletRequest,MyWebAuthenticationDetails> {
    @Override
    public MyWebAuthenticationDetails buildDetails(HttpServletRequest context) {
        return new MyWebAuthenticationDetails(context);
    }
}
