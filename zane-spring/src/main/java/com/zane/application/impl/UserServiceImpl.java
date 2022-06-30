package com.zane.application.impl;

import com.zane.adapter.dto.UserDTO;
import com.zane.application.inf.UserService;
import com.zane.domain.factory.DomainFactory;
import com.zane.domain.user.UserDomain;
import com.zane.domain.user.UserDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  3:40 PM
 * @version: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDomainService userDomainService;

    public List<UserDTO> list() {
        return userDomainService.pageQuery();
    }

    public int add(String name, int age){
        UserDomain userDomain = DomainFactory.get(UserDomain.class);
        userDomain.setName(name);
        userDomain.setAge(age);

        userDomain.save();
        return userDomain.getId();
    }
}
