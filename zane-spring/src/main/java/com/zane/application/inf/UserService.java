package com.zane.application.inf;

import com.zane.dto.UserDTO;

import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  3:39 PM
 * @version: 1.0.0
 */
public interface UserService {
    /**
     * 获取用户列表
     */
    List<UserDTO> list();

    UserDTO add(String name, int age);
}
