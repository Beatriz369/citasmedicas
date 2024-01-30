/**
 * 
 */
package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "pacientes")
@EntityListeners(AuditingEntityListener.class)
public class Pacientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidoP")
	private String apellidoP;

	@Column(name = "apellidoM")
	private String apellidoM;

	@Column(name = "edad")
	private int edad;

	@Override
	public String toString() {
		return "Pacientes [idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellidoP=" + apellidoP
				+ ", apellidoM=" + apellidoM + ", edad=" + edad + "]";
	}

	public Pacientes(Long idPaciente, String nombre, String apellidoP, String apellidoM, int edad) {
		super();
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
	}
	
	
	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Pacientes() {
		
	}
	
	
	
	
}
