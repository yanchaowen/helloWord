package com.example.helloword;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userMapper {
    @Select("select real_name from user where id = #{id}")
    public User findById(int id);
}
