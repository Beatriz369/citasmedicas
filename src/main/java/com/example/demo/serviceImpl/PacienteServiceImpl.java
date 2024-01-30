/**
 * 
 */
package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pacientes;
import com.example.demo.repository.PacientesRepository;
import com.example.demo.service.PacienteService;

/**
 * 
 */
@Service

public class PacienteServiceImpl implements PacienteService{

	
	
	@Autowired
	PacientesRepository paciente;

	public List<Pacientes> llamartodos() {
		return paciente.findAll();

	}

	public List<Pacientes> llamaruno(Long idPaciente) {
		return paciente.findByidPaciente(idPaciente);

	}

	@Override
	public String guardar(Pacientes b) {
		paciente.save(b);
		return "guardar";
	}

	@Override
	public String modificar(Pacientes b) {
		paciente.save(b);
		return "modificar";
	}

	@Override
	public void eliminar(Long idPaciente) {
		paciente.deleteByidPaciente(idPaciente);
	}

}
