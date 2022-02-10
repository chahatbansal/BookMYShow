package com.webapp.bookmyshowapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="city")
@Getter@Setter
public class City implements Serializable{

	private static final long serialVersionUID = 544731671224028312L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	private Date created;
	
	private Date modified;
	
	 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    @JoinTable(name = "city_movies",
	            joinColumns = {
	                    @JoinColumn(name = "city_id", referencedColumnName = "id",
	                            nullable = false, updatable = false)},
	            inverseJoinColumns = {
	                    @JoinColumn(name = "movie_id", referencedColumnName = "id",
	                            nullable = false, updatable = false)})
	    private Set<Movie> movies = new HashSet<Movie>();

}
