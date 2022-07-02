package com.electro.connection.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.electro.connection.entity.TypeConnection;

@Repository
public interface SaveConnection extends JpaRepository<TypeConnection, Integer> {

	@SuppressWarnings("unchecked")
	TypeConnection save(TypeConnection typeConnection);
	
	Optional<TypeConnection> findById(Long id);
}
