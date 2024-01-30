package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Consultorios;
import com.example.demo.repository.ConsultoriosRepository;
import com.example.demo.service.ConsultoriosService;
@Service

public class ConsultoriosServiceImpl implements ConsultoriosService{
	
	@Autowired
	ConsultoriosRepository hospitales;

	public List<Consultorios> llamartodos() {
		return hospitales.findAll();

	}

	public List<Consultorios> llamaruno(int idConsultorio) {
		return hospitales.deleteByIdConsultorio(idConsultorio);

	}

	@Override
	public String guardar(Consultorios b) {
		hospitales.save(b);
		return "guardar";
	}

	@Override
	public String modificar(Consultorios b) {
		hospitales.save(b);
		return "modificar";
	}

	@Override
	public void eliminar(int idConsultorio) {
		hospitales.deleteByIdConsultorio(idConsultorio);
	}

	

	
}
