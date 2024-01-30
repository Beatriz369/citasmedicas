package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultorios")
@EntityListeners(AuditingEntityListener.class)
public class Consultorios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idConsultorio")
	private Long idConsultorio;
	
	@Column(name = "numero")

	private int numero;

	@Column(name = "piso")

	private String piso;

	

	public Long getIdConsultorio() {
		return idConsultorio;
	}



	public void setIdConsultorio(Long idConsultorio) {
		this.idConsultorio = idConsultorio;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getPiso() {
		return piso;
	}



	public void setPiso(String piso) {
		this.piso = piso;
	}



	public Consultorios(Long idConsultorio, int numero, String piso) {
		super();
		this.idConsultorio = idConsultorio;
		this.numero = numero;
		this.piso = piso;
	}



	public Consultorios() {
		
	}
	
	
	
	
}
