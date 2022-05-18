package com.bnta.footballclub.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String country;
    @OneToMany(mappedBy = "club")
    @JsonIgnoreProperties({"club"})
    private List<Footballer> footballers;

    public Club(String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.footballers = new ArrayList<Footballer>();
    }

    public Club() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Footballer> getFootballers() {
        return footballers;
    }

    public void setFootballers(List<Footballer> footballers) {
        this.footballers = footballers;
    }
}
