package com.bluei.indoor.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public Optional<User> findByUsername(String username);
}
