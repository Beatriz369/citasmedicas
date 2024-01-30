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
@Table(name = "doctores")
@EntityListeners(AuditingEntityListener.class)
public class Doctores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoctor;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidoP")
	private String apellidoP;

	@Column(name = "apellidoM")
	private String apellidoM;

	@Column(name = "edad")
	private int edad;
	
	@Column(name = "especialidad")
	private String especialidad;
	

	public Long getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public Doctores(Long idDoctor, String nombre, String apellidoP, String apellidoM, int edad, String especialidad) {
		super();
		this.idDoctor = idDoctor;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
		this.especialidad = especialidad;
	}

	public Doctores() {

	}

	@Override
	public String toString() {
		return "Doctores [idDoctor=" + idDoctor + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM="
				+ apellidoM + ", edad=" + edad + "]";
	}

}
