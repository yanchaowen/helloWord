package com.example.helloword.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface mapper {
    @Select("select * from user where id = #{id}")
    public Map<String, Object> findById(int id);
}
