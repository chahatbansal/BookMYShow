package com.webapp.bookmyshowapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webapp.bookmyshowapp.model.City;
import com.webapp.bookmyshowapp.repository.CityRepository;

@Component
public class CityDaoImpl {

    @Autowired
    CityRepository cityRepository;

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }
}
