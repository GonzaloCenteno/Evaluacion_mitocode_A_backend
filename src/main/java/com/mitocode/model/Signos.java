package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "signos")
public class Signos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signos_paciente"))
	private Paciente paciente;
	
	private LocalDateTime fecha;
	
	@Size(min = 3, message = "Temperatura debe tener minimo 3 caracteres")
	@Column(name = "temperatura", nullable = false, length = 90)
	private String temperatura;
	
	private Integer pulso;
	
	@Size(min = 3, message = "Ritmo Respiratorio debe tener minimo 3 caracteres")
	@Column(name = "ritmo_respiratorio", nullable = false, length = 90)
	private String ritmo_respiratorio;
	
	public Integer getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public Integer getPulso() {
		return pulso;
	}

	public void setPulso(Integer pulso) {
		this.pulso = pulso;
	}

	public String getRitmo_respiratorio() {
		return ritmo_respiratorio;
	}

	public void setRitmo_respiratorio(String ritmo_respiratorio) {
		this.ritmo_respiratorio = ritmo_respiratorio;
	}

}
