package com.championship.swiss_system.repository;

import com.championship.swiss_system.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel, UUID> {
}
