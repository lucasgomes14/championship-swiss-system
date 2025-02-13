package com.championship.swiss_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_technicalCommittee")
public class TechnicalCommittee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Function function;

    private Byte[] photo;
}
