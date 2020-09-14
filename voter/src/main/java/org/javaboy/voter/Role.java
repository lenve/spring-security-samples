package org.javaboy.voter;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public class Role implements GrantedAuthority {
    private String name;

    private List<SimpleGrantedAuthority> allowedOperations = new ArrayList<>();

    @Override
    public String getAuthority() {
        return name;
    }

    public List<SimpleGrantedAuthority> getAllowedOperations() {
        return allowedOperations;
    }

    public void setAllowedOperations(List<SimpleGrantedAuthority> allowedOperations) {
        this.allowedOperations = allowedOperations;
    }
}
