package com.bnta.footballclub.repositories;

import com.bnta.footballclub.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {
}
