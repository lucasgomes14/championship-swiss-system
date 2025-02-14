package com.championship.swiss_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_championship")
public class ChampionshipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private LocalDate date;

    @OneToMany(mappedBy = "championshipModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MatchModel> matchModels = new ArrayList<>();
}
