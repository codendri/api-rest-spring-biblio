package com.example.techbiblio.infrastructure.local.db;

import com.example.techbiblio.domain.membre.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre,Long> {


}
