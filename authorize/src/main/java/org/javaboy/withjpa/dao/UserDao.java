package org.javaboy.withjpa.dao;

import org.javaboy.withjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
}
