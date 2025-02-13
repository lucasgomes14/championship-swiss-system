package com.championship.swiss_system.repository;

import com.championship.swiss_system.model.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeamRepository extends JpaRepository<TeamModel, UUID> {
}
