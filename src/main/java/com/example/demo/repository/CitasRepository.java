/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Citas;

import jakarta.transaction.Transactional;

/**
 * 
 */

@Repository
@Transactional




public interface CitasRepository extends JpaRepository<Citas, Long> {

		List<Citas> findByidCita(@Param("idCita") Long idDCita);
		List<Citas> findAll();
		
	void deleteByidCita(@Param("idCita") Long idCita);	
	
}
