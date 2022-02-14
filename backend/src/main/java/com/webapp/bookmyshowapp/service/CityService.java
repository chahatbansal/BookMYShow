package com.webapp.bookmyshowapp.service;

import com.webapp.bookmyshowapp.form.CityCreateForm;
import com.webapp.bookmyshowapp.model.City;

public interface CityService {
	
   City getCity(long id);

    City saveCity(CityCreateForm cityCreateForm) throws Exception;
}
