package com.example.server.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Game {
    
    @Id
    @GeneratedValue
    private UUID id;

    private OffsetDateTime date;
    
    private String firstTeamCountryCode;
    private String secondTeamCountryCode;

    @OneToMany
    private List<Guess> guesses;

}
