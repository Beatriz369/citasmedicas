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
import java.util.Date;

/**
 * 
 */
@Entity
@Table(name = "citas")
@EntityListeners(AuditingEntityListener.class)
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idCita")
	private Long idCita;
	
	
	
	@Column(name = "idConsultario")
	private Long idConsultario;
	
	@Column(name = "idDoctor")
	private Long idDoctor;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private int  hora;
	
	@Column(name = "paciente")
	private String  paciente;
	
	@Column(name = "idpaciente")
	private Long  idpaciente;
	
	public Long getIdCita() {
		return idCita;
	}

	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}

	

	public Long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}

	public Long idConsultario() {
		return idConsultario;
	}

	public void idConsultario(Long idConsultario) {
		this.idConsultario = idConsultario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	

	public Long getIdConsultario() {
		return idConsultario;
	}

	public void setIdConsultario(Long idConsultario) {
		this.idConsultario = idConsultario;
	}

	public Long getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	

	@Override
	public String toString() {
		return "Citas [idCita=" + idCita + ", idPaciente="  + ", idConsultario=" + idConsultario
				+ ", idDoctor=" + idDoctor + ", fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + "]";
	}

	

	public Citas() {
		
	}
}
