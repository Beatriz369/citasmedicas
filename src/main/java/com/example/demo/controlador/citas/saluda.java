package com.example.demo.controlador.citas;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/saludo")
public class saluda {
		@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
		public String saludo() {
			return "Hola Betty ";
		}
	
	
}
