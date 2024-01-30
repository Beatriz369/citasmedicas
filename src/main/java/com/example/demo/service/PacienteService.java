/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pacientes;

/**
 * 
 */
public interface PacienteService {
	List<Pacientes> llamartodos();
	List<Pacientes> llamaruno(Long IdPaciente);
	String guardar(Pacientes hospi);
	String modificar(Pacientes hospi);
	void eliminar(Long IdPaciente);
}
