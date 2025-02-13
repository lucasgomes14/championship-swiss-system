package com.championship.swiss_system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_player")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private Integer age;

    private Integer height;

    private Integer weight;

    @Enumerated(EnumType.STRING)
    private Position position;

    private byte[] photo;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    @JsonIgnore
    private TeamModel teamModel;
}
