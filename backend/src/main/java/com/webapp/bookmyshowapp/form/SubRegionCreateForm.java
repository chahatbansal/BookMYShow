package com.webapp.bookmyshowapp.form;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class SubRegionCreateForm {
	
	 @NotBlank(message="Region Name should not be blank.")
	 private String regionName;

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@NotBlank(message="City Name should not be blank.")
	 private String cityName;
}
