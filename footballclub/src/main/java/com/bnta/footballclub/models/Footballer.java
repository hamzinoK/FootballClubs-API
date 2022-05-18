package com.bnta.footballclub.models;


import javax.persistence.*;

@Entity
@Table(name  = "footballers")
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int playerRating;
    // pinned for later
    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;

    public Footballer(String name, int playerRating, Club club) {
        this.id = id;
        this.name = name;
        this.playerRating = playerRating;
        this.club = club;
    }

    public Footballer() {
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

    public int getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(int playerRating) {
        this.playerRating = playerRating;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
