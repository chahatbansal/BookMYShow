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

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public MovieLanguage getLanguage() {
		return language;
	}

	public void setLanguage(MovieLanguage language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public CertificateType getCertifcateType() {
		return certifcateType;
	}

	public void setCertifcateType(CertificateType certifcateType) {
		this.certifcateType = certifcateType;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Set<Casting> getCasting() {
		return casting;
	}

	public void setCasting(Set<Casting> casting) {
		this.casting = casting;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*	@JsonIgnore
        @ManyToMany(mappedBy = "movies", fetch = FetchType.LAZY)
        private Set<City> cities = new HashSet<City>();
    */
	//Cast
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "movie_cast",
			joinColumns = {
					@JoinColumn(name = "movie_id", referencedColumnName = "id",
							nullable = false, updatable = false)},
			inverseJoinColumns = {
					@JoinColumn(name = "cast_id", referencedColumnName = "id",
							nullable = false, updatable = false)})
	private Set<Casting> casting = new HashSet<Casting>();

}
