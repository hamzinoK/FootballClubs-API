package com.bnta.footballclub.repositories;

import com.bnta.footballclub.models.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Long> {
}
