package com.bluei.indoor.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bluei.indoor.entities.Structure;

public interface StructureRepository extends CrudRepository<Structure, Integer>{
	public List<Structure> findByAreaId(int id);

}
