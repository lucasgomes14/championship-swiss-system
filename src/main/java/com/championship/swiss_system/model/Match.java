package com.championship.swiss_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private Team team1;

    private Team team2;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Team winner;

    private Integer teamScore1;

    private Integer teamScore2;
}
