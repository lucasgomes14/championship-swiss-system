package com.championship.swiss_system.repository;

import com.championship.swiss_system.model.MatchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MatchRepository extends JpaRepository<MatchModel, UUID> {
}
