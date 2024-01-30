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

import com.example.demo.model.Pacientes;
import com.example.demo.service.PacienteService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/pacientes")




public class PacienteController {


	@Autowired
	 PacienteService paciente;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Pacientes> llamartodos() {
		return paciente.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{idPaciente}", produces = { "application/json" })
	public List<Pacientes> llamauno(@PathVariable("idPaciente") Long idPaciente) {
		return paciente.llamaruno(idPaciente);
	}
	@PostMapping("/guardar")
	public String guardar(@RequestBody Pacientes b) {
		paciente.guardar(b);
		return "guardar";
	}

	@PutMapping("/modificar")
	public String modificar(@RequestBody Pacientes b) {
		paciente.modificar(b);
		return "modificar";
	}

	
	
	@DeleteMapping("/eliminar/{idPaciente}")
	public String eliminar(@PathVariable("idPaciente")Long idPaciente) {
		paciente.eliminar(idPaciente);
		return "eliminar";
	}
	
	

	
	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty saludo desde Pacientes";
	}
	
}
