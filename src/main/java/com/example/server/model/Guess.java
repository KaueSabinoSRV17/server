package com.example.server.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Guess {
   
    @Id
    @GeneratedValue
    private UUID id;

    private Integer firstTeamPoints;
    private Integer secondTeamPoints;
    private OffsetDateTime createdAt;

    @ManyToOne
    private Game game;

}
