package com.bluei.indoor.repository;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.Path;

public interface PathRepository extends CrudRepository<Path, Integer> {
	public Path findByName(String name);

}
