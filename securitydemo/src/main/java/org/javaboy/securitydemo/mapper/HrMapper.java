package org.javaboy.securitydemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.securitydemo.model.Hr;
import org.javaboy.securitydemo.model.Role;

import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 */
@Mapper
public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getRolesByHrid(Integer id);
}
