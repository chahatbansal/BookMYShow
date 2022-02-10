package com.webapp.bookmyshowapp.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CastCreateForm {
    @NotBlank(message="cast name should not be blank.")
    private String cast_name;

    @NotNull(message="cast image  should not be blank.")
    private String cast_image;

}
