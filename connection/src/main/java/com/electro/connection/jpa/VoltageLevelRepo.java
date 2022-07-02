package com.electro.connection.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electro.connection.entity.VoltageLevel;

@Repository
public interface VoltageLevelRepo extends JpaRepository<VoltageLevel, Integer> {

	Optional<VoltageLevel> findById(Long id);
	
	List<VoltageLevel>findAll();
	
	@SuppressWarnings("unchecked")
	VoltageLevel save(VoltageLevel v);
}
