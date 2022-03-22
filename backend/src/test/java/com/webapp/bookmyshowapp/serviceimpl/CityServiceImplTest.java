package com.webapp.bookmyshowapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;


import com.webapp.bookmyshowapp.dao.CityDaoImpl;
import com.webapp.bookmyshowapp.model.City;

import com.webapp.bookmyshowapp.util.DateUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CityServiceImplTest {

    @Autowired
    CityServiceImpl cityServiceImpl = new CityServiceImpl();

    @Mock
    CityDaoImpl cityDaoImpl;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void getAllCities(){

        //given
        List<City> cityList = new ArrayList<City>();
        City city1 = new City();
        city1.setId(1L);
        city1.setCreated(DateUtil.getCurrentDateAndTime());
        city1.setName("Delhi");

        City city2 = new City();
        city2.setId(2L);
        city2.setCreated(DateUtil.getCurrentDateAndTime());
        city2.setName("Mumbai");

        cityList.add(city1);
        cityList.add(city2);


        Mockito.when(cityDaoImpl.getAllCities()).thenReturn(cityList);

        //expected
        assertEquals(2,cityList.size());

    }
}
