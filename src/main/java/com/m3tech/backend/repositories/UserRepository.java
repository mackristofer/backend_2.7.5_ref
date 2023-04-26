package com.m3tech.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m3tech.backend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
