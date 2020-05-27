package com.example.demo.controllers;

import com.example.demo.dao.CityMapper;
import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/city")
public class CityController {


    @Autowired
    private CityMapper cityMapper;


    @GetMapping("/state")
    public Date city(@RequestParam(value = "name", defaultValue = "CA") String name) {
        City data = cityMapper.findByState(name);
        return new Date();
    }

    @PostMapping("/state")
    public String city2(@RequestParam(value = "name", defaultValue = "CA") String name) {
        City data = cityMapper.findByState(name);
        return String.format("city %s!", data.getCity());
    }

    @RequestMapping("/all")
    public List<City> getCityList(){
        return cityMapper.findAll();
    }

    @RequestMapping("/add")
    public String Add(City c) {
        int id = cityMapper.addCity(c);
        return "good";
    }
}
