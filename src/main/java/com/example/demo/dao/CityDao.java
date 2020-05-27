package com.example.demo.dao;

import com.example.demo.model.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

//@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(int id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}
