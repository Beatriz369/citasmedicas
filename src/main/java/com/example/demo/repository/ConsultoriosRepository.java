/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Consultorios;

/**
 * 
 */

@Repository
@Transactional



public interface ConsultoriosRepository extends JpaRepository<Consultorios, Long> {
	List<Consultorios> findByIdConsultorio(@Param("IdConsultorio") int IdConsultorio);
	List<Consultorios> findAll();
	
	List<Consultorios> deleteByIdConsultorio(@Param("IdConsultorio") int IdConsultorio);

}
