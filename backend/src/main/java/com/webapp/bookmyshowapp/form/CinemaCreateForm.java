package com.webapp.bookmyshowapp.form;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaCreateForm {

    @NotBlank(message="cinema name should not be blank.")
    private String cinema_name;

    @NotBlank(message="cinema address should not be blank.")
    private String cinema_address;

}
