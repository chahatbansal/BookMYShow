package com.webapp.bookmyshowapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="sub_region")
@Getter
@Setter
public class SubRegion {
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String region_name;

    private Date created;

    private Date modified;
}
