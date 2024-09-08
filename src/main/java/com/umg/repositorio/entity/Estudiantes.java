package com.umg.repositorio.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "estudiantes")
@Data
public class Estudiantes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	
	@Column(name = "fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	@Column(name = "correo_electronico")
	private String correoElectronico;
	private String grado;
	@Column(name = "fecha_inscripcion")
	private LocalDateTime fechaInscripcion;
}
