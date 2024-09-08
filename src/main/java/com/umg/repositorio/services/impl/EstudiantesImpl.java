package com.umg.repositorio.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.microservice.entity.Estudiante;
import com.umg.repositorio.entity.Estudiantes;
import com.umg.repositorio.repository.IEstudiantesRepository;
import com.umg.repositorio.services.IEstudiantes;

@Service
public class EstudiantesImpl implements IEstudiantes {
	
	//inyeccion de dependencias
	@Autowired
	protected IEstudiantesRepository estudianteRepository;

	@Override
	public List<Estudiantes> findAll() {
		/*
		Iterable<Estudiantes> estudiantes = estudianteRepository.findAll();
		//convertir iterable a una lista
		List<Estudiantes> listEstudiantes = StreamSupport
                .stream(estudiantes.spliterator(), false)
                .collect(Collectors.toList());*/
		return (List<Estudiantes>) estudianteRepository.findAll();
	}

	@Override
	public Estudiantes save(Estudiantes estudiante) {
		Estudiantes newEstudiante = estudianteRepository.save(estudiante);
		return newEstudiante;
	}

	@Override
	public Estudiantes update(Integer id, Estudiantes estudiante) {
		Optional<Estudiantes> optionalEstudiante = estudianteRepository.findById(id);
		
		if(optionalEstudiante.isPresent())
			return estudianteRepository.save(estudiante);
		
		return null;
	}

	@Override
	public Integer deleteById(Integer id) {
		if(!estudianteRepository.existsById(id))
			return 404;
		else {
			estudianteRepository.deleteById(id);
			return 204;
		}
	}

}
