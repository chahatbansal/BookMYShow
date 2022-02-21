package com.webapp.bookmyshowapp.constant;

public class RestEndPoints {
	
	public static final String PARENTAPI = "/api";
	/*
	 * movie
	 */
	public static final String CREATE_MOVIE = "/movie/new";
	public static final String GET_MOVIE = "/movie/{id}";
	public static final String DELETE_MOVIE = "/movie/delete/{id}";
	/*
	* city
	*/
	public static final String CREATE_CITY = "/city/new";
	public static final String GET_CITY = "/city/{id}";
	public static final String DELETE_CITY = "/city/delete/{id}";
	
	/*
	 * Theater Movie
	 */
	public static final String CREATE_THEATER_MOVIE = "/theatermovie/new";
	
	public static final String GET_MOVEIS_BY_CITY = "/moviesby/{city_id}";
	public static final String GET_THEATERS_BY_CITY_MOVIE = "/theaters/{city_id}/{movie_id}";
	public static final String GET_THEATERS_BY_CITY_REGION_MOVIE = "/theaters/{city_id}/{region_id}/{movie_id}";
	/*
	 * casting
	 */
	public static final String CREATE_CAST = "/casting/new";
	public static final String GET_CAST = "/casting/{id}";
	public static final String DELETE_CAST = "/casting/delete/{id}";
	/*
	 *
	 */
	public static final String CREATE_SECTION = "/section/new";
	public static final String GET_SECTIONS = "/sections";

	public static final String DELETE_SECTION = "/section/delete/{id}";
	public static final String CREATE_CLASS = "/class/new";
	public static final String GET_CLASSES = "/classes";
	public static final String GET_CLASS = "/class/{id}";
	public static final String DELETE_CLASS = "/class/delete/{id}";
	
	public static final String CREATE_STATE = "/state/new";
	public static final String GET_STATES = "/states";
	public static final String GET_STATE = "/state/{id}";
	public static final String DELETE_STATE = "/state/delete/{id}";
	
	public static final String CREATE_SUBREGION = "/subregion/new";
	
	public static final String CREATE_THEATER = "/theater/new";
	
}
