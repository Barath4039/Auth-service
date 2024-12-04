package com.barath.warehouse.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barath.warehouse.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

}
