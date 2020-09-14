package org.javaboy.acls.controller;

import org.javaboy.acls.model.NoticeMessage;
import org.javaboy.acls.service.NoticeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.domain.BasePermission;
import org.springframework.security.acls.domain.ObjectIdentityImpl;
import org.springframework.security.acls.domain.PrincipalSid;
import org.springframework.security.acls.jdbc.JdbcMutableAclService;
import org.springframework.security.acls.model.MutableAcl;
import org.springframework.security.acls.model.ObjectIdentity;
import org.springframework.security.acls.model.Permission;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class NoticeMessageController {
    @Autowired
    NoticeMessageService noticeMessageService;

    @GetMapping("/all")
    public List<NoticeMessage> findAll() {
        return noticeMessageService.findAll();
    }

    @GetMapping("/byid")
    public NoticeMessage findById(Integer id) {
        return noticeMessageService.findById(id);
    }

    @PostMapping("/save")
    public NoticeMessage save(NoticeMessage noticeMessage) {
        return noticeMessageService.save(noticeMessage);
    }

    @Autowired
    JdbcMutableAclService jdbcMutableAclService;

    @GetMapping("/test01")
    @Transactional
    public void test01() {
        ObjectIdentity objectIdentity = new ObjectIdentityImpl(NoticeMessage.class, 1);
        Permission p = BasePermission.ADMINISTRATION;
        MutableAcl acl = jdbcMutableAclService.createAcl(objectIdentity);
        acl.insertAce(acl.getEntries().size(), p, new PrincipalSid("hr"), true);
        jdbcMutableAclService.updateAcl(acl);
    }
}
