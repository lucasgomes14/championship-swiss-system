package com.championship.swiss_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;

    private List<Player> players;

    private List<TechnicalCommittee> technicalCommittee;

    private Byte[] logoImage;

    private Integer victories;

    private Integer defeats;
}
