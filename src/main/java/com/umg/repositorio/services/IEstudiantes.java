package com.umg.repositorio.services;

import java.util.List;

import com.umg.repositorio.entity.Estudiantes;

public interface IEstudiantes {
	List<Estudiantes> findAll();//get
	Estudiantes save(Estudiantes estudiante); //post
	Estudiantes update(Integer id, Estudiantes estudiante);//put
	String deleteById(Integer id);//delete	
}
