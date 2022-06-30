package com.zane.domain.user;

import com.zane.adapter.dto.UserDTO;
import com.zane.domain.user.repository.UserEntity;
import com.zane.infrastructure.mysql.entity.UserDO;

/**
 * @author: ps
 * @since: 2022/6/30  9:08 PM
 * @version: 1.0.0
 */
public class UserConverter {

    public static UserDTO convert(UserEntity entity){
        // TODO: 2022/6/30 使用 mapstruct
        UserDTO userDTO = new UserDTO();
        userDTO.setId(entity.getId());
        userDTO.setName(entity.getName());
        userDTO.setAge(entity.getAge());

        return userDTO;
    }

    public static UserEntity convert(UserDO userDO){
        // TODO: 2022/6/30 使用 mapstruct
        UserEntity entity = new UserEntity();
        entity.setId(userDO.getId());
        entity.setName(userDO.getName());
        entity.setAge(userDO.getAge());

        return entity;
    }
}
