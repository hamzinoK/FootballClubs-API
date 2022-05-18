package com.bnta.footballclub.components;


import com.bnta.footballclub.models.Club;
import com.bnta.footballclub.models.Footballer;
import com.bnta.footballclub.repositories.ClubRepository;
import com.bnta.footballclub.repositories.FootballerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    FootballerRepository footballerRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        Club club1 = new Club("Manchester United", "England");
        clubRepository.save(club1);

        Footballer footballer1 = new Footballer("Cristiano Ronaldo", 87, club1);
        footballerRepository.save(footballer1);

        Footballer footballer2 = new Footballer("Bruno Fernandes", 86, club1);
        footballerRepository.save(footballer2);

        Footballer footballer3 = new Footballer("Paul Pogba", 84, club1);
        footballerRepository.save(footballer3);

        Club club2 = new Club("Real Madrid", "Spain");
        clubRepository.save(club2);

        Footballer footballer4 = new Footballer("Karim Benzema", 90, club2);
        footballerRepository.save(footballer4);

        Footballer footballer5 = new Footballer("Luka Modric", 88, club2);
        footballerRepository.save(footballer5);
    }
}
