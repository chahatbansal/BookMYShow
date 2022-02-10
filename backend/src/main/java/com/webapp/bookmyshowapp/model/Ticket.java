package com.webapp.bookmyshowapp.model;

import com.webapp.bookmyshowapp.enums.SeatType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ticket")
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String movie_name;

    private Date show_time;

    private String seat_number;

    private SeatType seat_type;

    private Float price;
}
