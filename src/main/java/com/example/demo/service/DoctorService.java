/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Doctores;

/**
 * 
 */
public interface DoctorService {
	List<Doctores> llamartodos();
	List<Doctores> llamaruno(Long IdDoctor);
	String guardar(Doctores doc);
	String modificar(Doctores doc);
	void eliminar(Long idDoctor);
}
