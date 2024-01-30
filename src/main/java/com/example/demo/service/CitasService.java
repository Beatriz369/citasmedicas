/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Citas;

/**
 * 
 */
public interface CitasService {
	List<Citas> llamartodos();
	List<Citas> llamaruno(Long IdCita);
	String guardar(Citas hospi);
	String modificar(Citas hospi);
	void eliminar(Long idCita);
}
