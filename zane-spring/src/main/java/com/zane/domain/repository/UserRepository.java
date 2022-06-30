package com.zane.domain.repository;


import com.zane.domain.user.repository.UserEntity;

import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  8:33 PM
 * @version: 1.0.0
 */
public interface UserRepository {

    List<UserEntity> pageQuery(int pageNo, int pageSize);

    int add(UserEntity userEntity);
}
