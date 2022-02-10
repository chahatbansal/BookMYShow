package com.webapp.bookmyshowapp.serviceimpl;

import com.webapp.bookmyshowapp.exceptions.DaoException;
import com.webapp.bookmyshowapp.form.CityCreateForm;
import com.webapp.bookmyshowapp.model.City;
import com.webapp.bookmyshowapp.repository.CityRepository;

import com.webapp.bookmyshowapp.service.CityService;

import com.webapp.bookmyshowapp.util.CityUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceException;

@Service
public class CityServiceImpl implements CityService {

    Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    CityUtil cityUtil;

    @Autowired
    CityRepository cityRepository;

	@Override
	@Transactional
	public City saveCity(CityCreateForm cityCreateForm) throws Exception {
		// TODO Auto-generated method stub
		 City city = null;
	        try {
	            city = cityUtil.createCity(cityCreateForm);
	            log.info("Persisting city record in db");
	            city = cityRepository.save(city);
	            log.info("Persisted city record in db successfully with id : " + city.getId());
	        }catch(PersistenceException de) {
	            throw new DaoException(de);
	        }catch(Exception ex) {
	            throw ex;
	        }
	        return city;
	}
}
