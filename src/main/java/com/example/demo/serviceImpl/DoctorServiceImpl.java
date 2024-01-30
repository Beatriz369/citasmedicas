package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctores;
import com.example.demo.repository.DoctoresRepository;
import com.example.demo.service.DoctorService;

@Service

public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctoresRepository doctor;
	
	
	@Override
	public List<Doctores> llamartodos() {
		return doctor.findAll();
		
	}
	
	@Override
	public List<Doctores> llamaruno(Long IdDoctor) {
		return doctor.findByidDoctor(IdDoctor);
	}

	@Override
	public String guardar(Doctores doc) {
		doctor.save(doc);
		return "guardar";
	}

	@Override
	public String modificar(Doctores doc) {
		doctor.save(doc);
		return "modificar";
	}

	public void eliminar(Long idDoctor) {
		
		//doctor.deleteById(idDoctor);
		doctor.deleteByidDoctor(idDoctor);

	}
	
	
	
	

}
