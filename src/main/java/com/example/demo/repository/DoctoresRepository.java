package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctores;

import jakarta.transaction.Transactional;

@Repository
@Transactional


public interface DoctoresRepository extends JpaRepository<Doctores, Long> {
	List<Doctores> findByidDoctor(@Param("idDoctor") Long idDoctor);
	List<Doctores> findAll();
	
	void deleteByidDoctor(@Param("idDoctor") Long idDoctor);
	

}
