package com.webapp.bookmyshowapp.form;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.webapp.bookmyshowapp.enums.SeatType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class TicketCreateForm {
    @NotBlank(message="movie name should not be blank.")
    private String movie_name;

    @NotNull(message="show time should not be blank.")
    private Date show_time;

    @NotBlank(message="seat number should not be blank.")
    private String seat_number;

    @NotNull(message="seat_type should not be blank.")
    private SeatType seat_type;

    @NotNull(message="price should not be null")
    private Float price;

}
