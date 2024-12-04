package com.barath.warehouse.user.services;

import java.util.Optional;

import com.barath.warehouse.user.entity.User;

public interface UserService {
	
	User registerUser(User user);
    Optional<User> findByUsername(String username);

}
