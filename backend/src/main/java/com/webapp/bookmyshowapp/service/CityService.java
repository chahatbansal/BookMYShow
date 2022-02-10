package com.webapp.bookmyshowapp.service;

import com.webapp.bookmyshowapp.form.CityCreateForm;
import com.webapp.bookmyshowapp.model.City;

public interface CityService {
    City saveCity(CityCreateForm cityCreateForm) throws Exception;
}
