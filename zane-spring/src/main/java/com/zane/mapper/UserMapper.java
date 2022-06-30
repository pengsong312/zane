package com.zane.mapper;

import com.zane.dto.UserDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  6:34 PM
 * @version: 1.0.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<UserDTO> list();

    @Insert({"INSERT INTO user(name,age) values(#{name},#{age})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int add(UserDTO user);
}
