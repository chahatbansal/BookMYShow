package com.webapp.bookmyshowapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webapp.bookmyshowapp.enums.CertificateType;
import com.webapp.bookmyshowapp.enums.Genre;
import com.webapp.bookmyshowapp.enums.MovieLanguage;
import com.webapp.bookmyshowapp.enums.SeatType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="movie")
@Getter@Setter
public class Movie implements Serializable{

	private static final long serialVersionUID = 7801948490902941821L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Date created;
	
	private Date modified;
	
	private String screenType;
	
	@Enumerated(EnumType.STRING)
	private MovieLanguage language;
	
	private String duration;
	
	private Date releaseDate;
	
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	@Enumerated(EnumType.STRING)
	private CertificateType certifcateType;
	
	private Integer rating;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "movies", fetch = FetchType.LAZY)
    private Set<City> cities = new HashSet<City>();
	
}
