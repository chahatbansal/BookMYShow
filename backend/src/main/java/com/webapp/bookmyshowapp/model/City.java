package com.webapp.bookmyshowapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public List<SubRegion> getSubRegions() {
		return subRegions;
	}

	public void setSubRegions(List<SubRegion> subRegions) {
		this.subRegions = subRegions;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    @JoinTable(name = "city_movies",
	            joinColumns = {
	                    @JoinColumn(name = "city_id", referencedColumnName = "id",
	                            nullable = false, updatable = false)},
	            inverseJoinColumns = {
	                    @JoinColumn(name = "movie_id", referencedColumnName = "id",
	                            nullable = false, updatable = false)})
	    private Set<Movie> movies = new HashSet<Movie>();
	 
	 
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.ALL)
	 private List<SubRegion> subRegions = new ArrayList<>();
}
