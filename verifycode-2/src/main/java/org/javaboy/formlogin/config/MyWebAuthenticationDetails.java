package org.javaboy.formlogin.config;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

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
public class MyWebAuthenticationDetails extends WebAuthenticationDetails {

    private boolean isPassed;

    public MyWebAuthenticationDetails(HttpServletRequest req) {
        super(req);
        String code = req.getParameter("code");
        String verify_code = (String) req.getSession().getAttribute("verify_code");
        if (code != null && verify_code != null && code.equals(verify_code)) {
            isPassed = true;
        }
    }

    public boolean isPassed() {
        return isPassed;
    }
}
