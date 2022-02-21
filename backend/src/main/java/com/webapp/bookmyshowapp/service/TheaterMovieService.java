package com.webapp.bookmyshowapp.service;

import java.util.Set;

import com.webapp.bookmyshowapp.form.TheaterMovieCreateForm;
import com.webapp.bookmyshowapp.model.Movie;
import com.webapp.bookmyshowapp.model.Theater;
import com.webapp.bookmyshowapp.model.TheaterMovie;

public interface TheaterMovieService {

	TheaterMovie createTheaterMovie(TheaterMovieCreateForm theaterMovieCreateForm) throws Exception;
	
	Set<Movie> getAllMoviesByCity(long cityId);
	
	Set<Theater> getAllTheatersByCityAndMovie(long cityId,long movieId);
	
	Set<Theater> getAllTheatersByCityAndRegionAndMovie(long cityId,long regionId,long movieId);
	
	
}
