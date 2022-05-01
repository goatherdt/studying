package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.ChildDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChildMapper {

    @Select("select * from child")
    List<ChildDO> findAll();
}
