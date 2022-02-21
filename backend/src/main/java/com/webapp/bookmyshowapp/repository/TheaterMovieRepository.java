package com.webapp.bookmyshowapp.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.bookmyshowapp.model.Movie;
import com.webapp.bookmyshowapp.model.Theater;
import com.webapp.bookmyshowapp.model.TheaterMovie;
import com.webapp.bookmyshowapp.model.TheaterMovieId;

@Repository
@Transactional(readOnly=true)
public interface TheaterMovieRepository extends JpaRepository<TheaterMovie,TheaterMovieId>{
	
	@Query("Select tm.movie FROM TheaterMovie tm where tm.theater.subRegion.city.id = :cityId")
	Set<Movie> getAllMoviesByCity(@Param("cityId") long cityId);
	
	@Query("Select tm.theater FROM TheaterMovie tm where tm.theater.subRegion.city.id = :cityId and tm.movie.id = :movieId")
	Set<Theater> getAllTheatersByCityAndMovie(@Param("cityId") long cityId, @Param("movieId") long movieId);
	
	@Query("Select tm.theater FROM TheaterMovie tm where tm.theater.subRegion.city.id = :cityId and tm.theater.subRegion.id = :regionId and tm.movie.id = :movieId")
	Set<Theater> getAllTheatersByCityAndRegionAndMovie(@Param("cityId") long cityId,@Param("regionId") long regionId, @Param("movieId") long movieId);
}
