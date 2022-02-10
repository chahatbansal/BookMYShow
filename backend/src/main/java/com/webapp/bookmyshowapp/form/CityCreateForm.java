package com.webapp.bookmyshowapp.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class CityCreateForm {
	
    @NotBlank(message="fullname should not be blank.")
    private String name;
    
    @NotNull(message="movies should not be null.")
    private Set<String> movies;
}
