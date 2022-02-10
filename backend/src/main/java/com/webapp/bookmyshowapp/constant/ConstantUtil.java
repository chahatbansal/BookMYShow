package com.webapp.bookmyshowapp.constant;

import org.springframework.stereotype.Component;

@Component
public class ConstantUtil {

	/*
	 * Status Code For Exceptions
	 */
	public static final int STATUS_CODE_DATABASE_ERROR  = 602;
	public static final int STATUS_CODE_BAD_REQUEST  = 400;
	public static final int STATUS_CODE_INTERNAL_SERVER_ERROR  = 500;
	public static final int STATUS_CODE_RESOURCE_NOT_FOUND  = 404;
	public static final int STATUS_CODE_OK=200;
	
	/*
	 * Movie Error
	 */
	public static final String ERROR_MOVIE_CREATE  = "Error creating movie";
	public static final String ERROR_MOVIE_NOT_FOUND  = "Error movies does not exist";
	
	
	/*
	 * City Error
	 */
	public static final String ERROR_CITY_CREATE  = "Error creating city";
}
