package com.zane.domain.user.repository;

import com.zane.domain.user.UserDomain;
import com.zane.infrastructure.mysql.entity.UserDO;

/**
 * @author: ps
 * @since: 2022/6/30  9:15 PM
 * @version: 1.0.0
 */
public class UserAssembler {

    public static UserEntity assemble(UserDomain userDomain){
        UserEntity entity = new UserEntity();
        entity.setName(userDomain.getName());
        entity.setAge(userDomain.getAge());

        return entity;
    }

    public static UserDO assemble(UserEntity entity){
        UserDO userDO = new UserDO();
        userDO.setName(entity.getName());
        userDO.setAge(entity.getAge());

        return userDO;
    }

}
