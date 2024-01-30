/**
 * 
 */
package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Citas;
import com.example.demo.repository.CitasRepository;
import com.example.demo.service.CitasService;

/**
 * 
 */
@Service

public class CitasServiceImpl implements CitasService{
	@Autowired
	CitasRepository citas;
	
	
	
	@Override
	public List<Citas> llamartodos() {
		return citas.findAll();
	}

	@Override
	public List<Citas> llamaruno(Long IdCita) {
		
		return citas.findByidCita(IdCita);
	}

	@Override
	public String guardar(Citas b) {
		Date fecha = new Date();
		b.setFecha(fecha);
		 citas.save(b);
		 return "guardar";
		 
		 
	}

	@Override
	public String modificar(Citas cita) {
		 citas.save(cita);
		 return "modificar";
	}

	@Override
	public void eliminar(Long IdCita) {
		citas.deleteByidCita(IdCita);

		
	}

	
	
	
	
	

}
