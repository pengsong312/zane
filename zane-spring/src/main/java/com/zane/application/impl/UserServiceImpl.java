package com.zane.application.impl;

import com.zane.application.inf.UserService;
import com.zane.dto.UserDTO;
import com.zane.mapper.UserMapper;
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
    private UserMapper userMapper;

    public List<UserDTO> list() {
//        List<UserDTO> users = Lists.newArrayListWithExpectedSize(10);
//        for (int i = 0; i < 10; i++) {
//            UserDTO userDTO = DomainFactory.newInstance(UserDTO.class);
//            userDTO.setId(i);
//            userDTO.setName("name_" + i);
//            userDTO.setAge(i);
//
//            users.add(userDTO);
//        }
//        return users;

        return userMapper.list();
    }

    public UserDTO add(String name, int age){
        UserDTO user = new UserDTO();
        user.setName(name);
        user.setAge(age);

        return userMapper.add(user) >= 1 ? user : null;
    }
}
