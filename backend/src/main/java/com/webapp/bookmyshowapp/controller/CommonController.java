package com.webapp.bookmyshowapp.controller;

import java.util.Objects;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.bookmyshowapp.constant.ConstantUtil;
import com.webapp.bookmyshowapp.constant.RestEndPoints;
import com.webapp.bookmyshowapp.model.Movie;
import com.webapp.bookmyshowapp.model.Theater;
import com.webapp.bookmyshowapp.service.TheaterMovieService;
import com.webapp.bookmyshowapp.util.BaseExceptionHandler;
import com.webapp.bookmyshowapp.util.LogConstantUtil;

@RestController
@RequestMapping(RestEndPoints.PARENTAPI)
public class CommonController extends BaseExceptionHandler{
	
	Logger log = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	TheaterMovieService theaterMovieService;

	@GetMapping(RestEndPoints.GET_MOVEIS_BY_CITY)
	public ResponseEntity<Object> getMoviesByCity(@PathVariable("city_id") long cityId){
		Set<Movie> movies = null;
		try {
			movies = theaterMovieService.getAllMoviesByCity(cityId);
			if(Objects.isNull(movies) || movies.isEmpty()) {
				return handle404ResourceNotFoundRequest(ConstantUtil.ERROR_MOVIE_NOT_FOUND);
			}
		}catch(Exception ex) {
			log.error("Exception Occured While geting movies " + LogConstantUtil.LOG_DBDOWN_AND_OTHER_EXCEPTION, ex);
	    	return handle500InternalServerError(ConstantUtil.ERROR_MOVIE_NOT_FOUND,ex);
		}
		return handle200OkRequest(movies);
	}
	
	@GetMapping(RestEndPoints.GET_THEATERS_BY_CITY_MOVIE)
	public ResponseEntity<Object> getAllTheatersByCityAndMovie(@PathVariable("city_id") long cityId,@PathVariable("movie_id") long movieId){
		Set<Theater> theaters = null;
		try {
			theaters = theaterMovieService.getAllTheatersByCityAndMovie(cityId,movieId);
			if(Objects.isNull(theaters) || theaters.isEmpty()) {
				return handle404ResourceNotFoundRequest(ConstantUtil.ERROR_THEATER_NOT_FOUND);
			}
		}catch(Exception ex) {
			log.error("Exception Occured While geting theaters " + LogConstantUtil.LOG_DBDOWN_AND_OTHER_EXCEPTION, ex);
	    	return handle500InternalServerError(ConstantUtil.ERROR_THEATER_NOT_FOUND,ex);
		}
		return handle200OkRequest(theaters);
	}
	

	@GetMapping(RestEndPoints.GET_THEATERS_BY_CITY_REGION_MOVIE)
	public ResponseEntity<Object> getAllTheatersByCityAndRegionAndMovie(@PathVariable("city_id") long cityId,@PathVariable("region_id") long regionId,@PathVariable("movie_id") long movieId){
		Set<Theater> theaters = null;
		try {
			theaters = theaterMovieService.getAllTheatersByCityAndRegionAndMovie(cityId,regionId,movieId);
			if(Objects.isNull(theaters) || theaters.isEmpty()) {
				return handle404ResourceNotFoundRequest(ConstantUtil.ERROR_THEATER_NOT_FOUND);
			}
		}catch(Exception ex) {
			log.error("Exception Occured While geting theaters " + LogConstantUtil.LOG_DBDOWN_AND_OTHER_EXCEPTION, ex);
	    	return handle500InternalServerError(ConstantUtil.ERROR_THEATER_NOT_FOUND,ex);
		}
		return handle200OkRequest(theaters);
	}

}
