package com.pupwalkr.repository;

import com.pupwalkr.model.Walkr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalkrRepository extends JpaRepository<Walkr, Integer> {
}
