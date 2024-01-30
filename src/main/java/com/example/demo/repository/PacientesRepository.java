/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Pacientes;

/**
 * 
 */
@Repository
@Transactional


	


public interface PacientesRepository extends JpaRepository<Pacientes, Long> {
	List<Pacientes> findByidPaciente(@Param("idPaciente") Long idPaciente);
	List<Pacientes> findAll();
	
	void deleteByidPaciente(@Param("idPaciente") Long idPaciente);
	
	

}
