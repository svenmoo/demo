package com.example.demo.dao;

import com.example.demo.model.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM City WHERE State = #{state}")
    City findByState(@Param("state") String state);

    @Select("SELECT * FROM City LIMIT 100")
    List<City> findAll();

    @Insert("INSERT City (State, City) VALUE (#{state}, #{city})")
    int addCity(City city);

}