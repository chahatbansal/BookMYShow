package com.webapp.bookmyshowapp.controller;

import java.util.ArrayList;
import java.util.List;

import com.webapp.bookmyshowapp.util.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.bookmyshowapp.constant.ConstantUtil;
import com.webapp.bookmyshowapp.constant.RestEndPoints;
import com.webapp.bookmyshowapp.exceptions.DaoException;
import com.webapp.bookmyshowapp.exceptions.MovieException;
import com.webapp.bookmyshowapp.form.MovieCreateForm;
import com.webapp.bookmyshowapp.model.Movie;
import com.webapp.bookmyshowapp.service.MovieService;
import com.webapp.bookmyshowapp.util.LogConstantUtil;
import com.webapp.bookmyshowapp.util.MovieUtil;

@RestController
@RequestMapping(RestEndPoints.PARENTAPI)
public class MovieController extends BaseExceptionHandler {

	Logger log = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	MovieUtil movieUtil;
	
	@Autowired
	MovieService movieService;
	
	@PostMapping(RestEndPoints.CREATE_MOVIE)
	public ResponseEntity<Object> createMovie(@RequestBody MovieCreateForm movieCreateForm){
		List<String> validationErrorList = new ArrayList<String>();
		Movie movie = null;
		try {
			log.info("Validating MovieCreateForm");
			validationErrorList = movieUtil.validate(movieCreateForm, validationErrorList);
			log.info("Movie Create Form Validation Completed");
			if(!validationErrorList.isEmpty()) {
				log.error(" Error occuured while validating movieCreateForm || " + LogConstantUtil.LOG_VALIDATION_ERRORLIST, validationErrorList);
				return handle400BadRequest(validationErrorList);
			}
			movie=movieService.saveMovie(movieCreateForm);
		}catch(MovieException me) {
			log.error("Exception occured while validating movie Create Form in movieutil " +LogConstantUtil.LOG_MOVIE_EXCEPTION,me);
			return handle400BadRequest(ConstantUtil.ERROR_MOVIE_CREATE,me);
		}catch(DaoException de) {
			log.error("Exception occured while creating movie record in db " +LogConstantUtil.LOG_DAO_EXCEPTION, de);
			return handle602DatabaseError(ConstantUtil.ERROR_MOVIE_CREATE,de);
		}catch(Exception ex) {
			log.error("Exception Occured While creating movie record " + LogConstantUtil.LOG_DBDOWN_AND_OTHER_EXCEPTION, ex);
			return handle500InternalServerError(ConstantUtil.ERROR_MOVIE_CREATE,ex);
		}
		return handle200OkRequest(movie);
	}
	
}