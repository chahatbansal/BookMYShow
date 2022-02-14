package com.webapp.bookmyshowapp.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.bookmyshowapp.model.Movie;

@Repository
@Transactional(readOnly=true)
public interface MovieRepository extends JpaRepository<Movie,Long>{
	
	@Query("FROM Movie m WHERE m.name in (:movies)")
	Set<Movie> findAllMoviesByNames(@Param("movies") Set<String> movieNames);
	
	Movie findById(long id);
}
