package com.zane.domain.user;

import com.zane.adapter.dto.UserDTO;
import com.zane.domain.repository.UserRepository;
import com.zane.domain.user.repository.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ps
 * @since: 2022/6/30  8:24 PM
 * @version: 1.0.0
 */
@Service
public class UserDomainService {

    @Resource
    private UserRepository userRepository;

    public List<UserDTO> pageQuery(){
        List<UserEntity> userEntities = userRepository.pageQuery(1, 10);
        return userEntities.stream().map(e -> UserConverter.convert(e)).collect(Collectors.toList());
    }
}
