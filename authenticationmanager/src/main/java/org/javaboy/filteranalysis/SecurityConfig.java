package org.javaboy.filteranalysis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
//@Configuration
//public class SecurityConfig {
//    @Bean
//    UserDetailsService us() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("sang").password("{noop}123").roles("admin").build());
//        return manager;
//    }
//
//    @Configuration
//    @Order(1)
//    static class DefaultWebSecurityConfig extends WebSecurityConfigurerAdapter {
//        UserDetailsService us1() {
//            InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//            manager.createUser(User.withUsername("javaboy").password("{noop}123").roles("admin", "aaa", "bbb").build());
//            return manager;
//        }
//
//        @Override
//        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            auth.userDetailsService(us1());
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.antMatcher("/foo/**")
//                    .authorizeRequests()
//                    .anyRequest().hasRole("admin")
//                    .and()
//                    .formLogin()
//                    .loginProcessingUrl("/foo/login")
//                    .permitAll()
//                    .and()
//                    .csrf().disable();
//        }
//    }
//
//    @Configuration
//    @Order(2)
//    static class DefaultWebSecurityConfig2 extends WebSecurityConfigurerAdapter {
//        UserDetailsService us2() {
//            InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//            manager.createUser(User.withUsername("江南一点雨").password("{noop}123").roles("user", "aaa", "bbb").build());
//            return manager;
//        }
//
//        @Override
//        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            auth.userDetailsService(us2());
//        }
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.antMatcher("/bar/**")
//                    .authorizeRequests()
//                    .anyRequest().hasRole("user")
//                    .and()
//                    .formLogin()
//                    .loginProcessingUrl("/bar/login")
//                    .permitAll()
//                    .and()
//                    .csrf().disable();
//        }
//    }
//}
