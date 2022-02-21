package com.webapp.bookmyshowapp.serviceimpl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.bookmyshowapp.form.TheaterMovieCreateForm;
import com.webapp.bookmyshowapp.model.Movie;
import com.webapp.bookmyshowapp.model.Theater;
import com.webapp.bookmyshowapp.model.TheaterMovie;
import com.webapp.bookmyshowapp.repository.TheaterMovieRepository;
import com.webapp.bookmyshowapp.service.TheaterMovieService;
import com.webapp.bookmyshowapp.util.TheaterMovieUtil;

@Service
public class TheaterMovieServiceImpl implements TheaterMovieService{

	Logger log = LoggerFactory.getLogger(TheaterMovieServiceImpl.class);

	@Autowired
	TheaterMovieRepository theaterMovieRepository;
	
	@Autowired
	TheaterMovieUtil theaterMovieUtil;
	
	
	@Override
	public TheaterMovie createTheaterMovie(TheaterMovieCreateForm theaterMovieCreateForm) throws Exception {
		// TODO Auto-generated method stub
		TheaterMovie theaterMovie = null;
		try {
			theaterMovie = theaterMovieUtil.createTheaterMovie(theaterMovieCreateForm);
			log.info("Persisting theatermovie record in db");
			theaterMovie=theaterMovieRepository.save(theaterMovie);
			log.info("Persisted theatermovie record in db successfully with id : " + theaterMovie.getId());
		}catch(Exception ex) {
			throw ex;
		}
		return theaterMovie;
	}


	@Override
	public Set<Movie> getAllMoviesByCity(long cityId) {
		// TODO Auto-generated method stub
		Set<Movie> movies=null;
		try {
			movies = theaterMovieRepository.getAllMoviesByCity(cityId);
		}catch(Exception ex) {
			throw ex;
		}
		return movies;
	}


	@Override
	public Set<Theater> getAllTheatersByCityAndMovie(long cityId,long movieId) {
		// TODO Auto-generated method stub
		Set<Theater> theaters=null;
		try {
			theaters = theaterMovieRepository.getAllTheatersByCityAndMovie(cityId,movieId);
		}catch(Exception ex) {
			throw ex;
		}
		return theaters;
	}


	@Override
	public Set<Theater> getAllTheatersByCityAndRegionAndMovie(long cityId, long regionId, long movieId) {
		// TODO Auto-generated method stub
		Set<Theater> theaters=null;
		try {
			theaters = theaterMovieRepository.getAllTheatersByCityAndRegionAndMovie(cityId,regionId,movieId);
		}catch(Exception ex) {
			throw ex;
		}
		return theaters;
	}
	
	

}
