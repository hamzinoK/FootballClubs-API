package com.bnta.footballclub.repositories;

import com.bnta.footballclub.models.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FootballerRepository extends JpaRepository<Footballer, Long> {

// Derived Query to return all players of 'playerRating' over 86
    List<Footballer> findFootballerByPlayerRating(int playerRating);

}
