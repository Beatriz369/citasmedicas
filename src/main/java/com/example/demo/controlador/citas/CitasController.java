package com.example.demo.controlador.citas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Citas;
import com.example.demo.service.CitasService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/citas")


public class CitasController {

	@Autowired
	CitasService cita;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Citas> llamartodos() {
		return cita.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{idCita}", produces = { "application/json" })
	public List<Citas> llamauno(@PathVariable("idCita") Long idPaciente) {
		return cita.llamaruno(idPaciente);
	}
	@PostMapping("/guardar")
	public String guardar(@RequestBody Citas b) {
		cita.guardar(b);
		return "guardar";
	}

	@PutMapping("/modificar")
	public String modificar(@RequestBody Citas b) {
		cita.modificar(b);
		return "modificar";
	}

	
	
	@DeleteMapping("/eliminar/{idCita}")
	public String eliminar(@PathVariable("idCita")Long idCita) {
		cita.eliminar(idCita);
		return "eliminar";
	}
	
	

	
	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty saludo desde Pacientes";
	}
	
}
