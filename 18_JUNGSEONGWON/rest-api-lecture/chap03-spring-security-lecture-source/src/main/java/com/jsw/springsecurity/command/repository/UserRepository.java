package com.jsw.springsecurity.command.repository;

import com.jsw.springsecurity.command.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {


     Optional<User> findByUsername(String username);
}
