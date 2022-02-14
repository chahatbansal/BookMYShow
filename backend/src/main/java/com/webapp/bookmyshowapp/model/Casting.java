package com.webapp.bookmyshowapp.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="casting")
@Getter@Setter
public class Casting implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7043767503442215835L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String castName;

    private String castImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public String getCastImage() {
        return castImage;
    }

    public void setCastImage(String castImage) {
        this.castImage = castImage;
    }
/* @JsonIgnore
    @ManyToMany(mappedBy = "casting", fetch = FetchType.LAZY)
    private Set<Movie> movies = new HashSet<Movie>();*/


}
