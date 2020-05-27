package com.example.demo.dao;

import com.example.demo.model.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM City WHERE State = #{state}")
    City findByState(@Param("state") String state);

}