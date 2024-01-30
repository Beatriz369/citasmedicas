/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Consultorios;

/**
 * 
 */
public interface ConsultoriosService {

	List<Consultorios> llamartodos();
	List<Consultorios> llamaruno(int IdConsultorio);
	String guardar(Consultorios hospi);
	String modificar(Consultorios hospi);
	void eliminar(int IdConsultorio);
}
