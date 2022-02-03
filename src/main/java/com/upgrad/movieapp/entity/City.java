package com.upgrad.movieapp.entity;

import java.util.Set;
import javax.persistence.*;

@Entity
public class City {

    @Id
    @GeneratedValue
    private int cityId;

    @Column(length = 20,nullable = false)
    private String cityName;

     @OneToMany(mappedBy = "city", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Theatre> theatres;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(Set<Theatre> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", theatres=" + theatres +
                '}';
    }
}
