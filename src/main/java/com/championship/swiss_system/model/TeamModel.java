package com.championship.swiss_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_team")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    @OneToMany(mappedBy = "teamModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlayerModel> playerModels = new ArrayList<>();

    @OneToMany(mappedBy = "teamModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TechnicalCommitteeModel> technicalCommitteeModel =  new ArrayList<>();

    private byte[] logoImage;

    private Integer victories;

    private Integer defeats;
}
