package com.zane.domain.user;

import com.zane.domain.factory.DomainEntity;
import com.zane.domain.repository.UserRepository;
import com.zane.domain.user.repository.UserAssembler;
import com.zane.domain.user.repository.UserEntity;
import lombok.Data;

import javax.annotation.Resource;

/**
 * @author: ps
 * @since: 2022/6/30  8:24 PM
 * @version: 1.0.0
 */
@Data
@DomainEntity
public class UserDomain {

    @Resource
    private UserRepository userRepository;

    private Integer id;

    private String name;

    private Integer age;


    public int save() {
        UserEntity entity = UserAssembler.assemble(this);
        userRepository.add(entity);

        this.id = entity.getId();
        return this.id;
    }
}
