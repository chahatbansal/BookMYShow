package com.webapp.bookmyshowapp.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
public class CityCreateForm {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getMovies() {
        return movies;
    }

    public void setMovies(Set<String> movies) {
        this.movies = movies;
    }

    @NotBlank(message="Name should not be blank.")
    private String name;
    
    @NotNull(message="Movies should not be null.")
    private Set<String> movies;
}
