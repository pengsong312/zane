package com.zane.infrastructure.mysql.mapper;

import com.zane.infrastructure.mysql.entity.UserDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  6:34 PM
 * @version: 1.0.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<UserDO> list();

    @Insert({"INSERT INTO user(name,age) values(#{name},#{age})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int add(UserDO user);
}
