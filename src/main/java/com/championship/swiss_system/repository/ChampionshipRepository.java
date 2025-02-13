package com.championship.swiss_system.repository;

import com.championship.swiss_system.model.ChampionshipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChampionshipRepository extends JpaRepository<ChampionshipModel, UUID> {
}
