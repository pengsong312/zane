package com.zane.infrastructure.mysql.repository;

import com.zane.domain.repository.UserRepository;
import com.zane.domain.user.UserConverter;
import com.zane.domain.user.repository.UserAssembler;
import com.zane.domain.user.repository.UserEntity;
import com.zane.infrastructure.mysql.entity.UserDO;
import com.zane.infrastructure.mysql.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ps
 * @since: 2022/6/30  8:38 PM
 * @version: 1.0.0
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserMapper userMapper;

    public List<UserEntity> pageQuery(int pageNo, int pageSize) {
        List<UserDO> userDOS = userMapper.list();

        return userDOS.stream().map(e -> UserConverter.convert(e)).collect(Collectors.toList());
    }

    public int add(UserEntity userEntity) {
        UserDO userDO = UserAssembler.assemble(userEntity);
        userMapper.add(userDO);

        userEntity.setId(userDO.getId());

        return userDO.getId();
    }
}
