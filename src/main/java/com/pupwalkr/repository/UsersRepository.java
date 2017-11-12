package com.pupwalkr.repository;

import com.pupwalkr.model.User;
import com.pupwalkr.model.Walkr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
