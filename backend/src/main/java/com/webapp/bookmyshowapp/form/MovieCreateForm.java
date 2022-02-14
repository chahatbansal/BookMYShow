package com.webapp.bookmyshowapp.form;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MovieCreateForm {
	@NotNull(message="fullname should not be blank.")
	private String name;

	@NotBlank(message="screen type should not be blank.")
	private String screenType;

	@NotBlank(message="language should not be blank.")
	private String language;

	@NotBlank(message="duration should not be blank.")
	private String duration;

	@NotNull(message="release date should not be blank.")
	private Date releaseDate;

	@NotBlank(message="genre should not be blank.")
	private String genre;

	@NotBlank(message="certificate type should not be blank.")
	private String certifcateType;

	@NotNull(message="rating should not be blank.")
	private Integer rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCertifcateType() {
		return certifcateType;
	}

	public void setCertifcateType(String certifcateType) {
		this.certifcateType = certifcateType;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Set<String> getCastName() {
		return castName;
	}

	public void setCastName(Set<String> castName) {
		this.castName = castName;
	}

	@NotNull(message="Cast should not be null.")
	private Set<String> castName ;

}
