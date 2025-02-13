package com.championship.swiss_system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_match")
public class MatchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_1_name", referencedColumnName = "name", nullable = false)
    private TeamModel teamModel1;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_2_name", referencedColumnName = "name", nullable = false)
    private TeamModel teamModel2;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Integer teamScore1;

    private Integer teamScore2;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_winner_name", referencedColumnName = "name")
    private TeamModel winner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_defeat_name", referencedColumnName = "name")
    private TeamModel defeat;

    @ManyToOne
    @JoinColumn(name = "championship_id")
    @JsonIgnore
    private ChampionshipModel championshipModel;
}
