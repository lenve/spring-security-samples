package org.javaboy.acls.controller;

import org.javaboy.acls.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
//@RestController
public class HelloController {

    @Autowired
    JdbcMutableAclService mutableAclService;

    @PostMapping(value = "/user")
    @Transactional
    @Secured({"ROLE_ADMIN","ROLE_USER"})
    public User create(User user) throws URISyntaxException {

//        NomCity result = nomCityRepository.save(nomCity);
//
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        ObjectIdentity oi = new ObjectIdentityImpl(User.class,user.getId());
//        MutableAcl acl = mutableAclService.createAcl(oi);
//
//        acl.insertAce(0, BasePermission.ADMINISTRATION, new GrantedAuthoritySid("ROLE_ADMIN"), true);
//        acl.insertAce(1, BasePermission.DELETE, new PrincipalSid(user.getUsername()), true);
//        acl.insertAce(2, BasePermission.READ, new GrantedAuthoritySid("ROLE_USER"), true);
//
//        mutableAclService.updateAcl(acl);
//
//        return ResponseEntity.created(new URI("/api/nomCitys/" + result.getId()))
//                .headers(HeaderUtil.createEntityCreationAlert("nomCity", result.getId().toString()))
//                .body(result);
        return null;
    }
}
