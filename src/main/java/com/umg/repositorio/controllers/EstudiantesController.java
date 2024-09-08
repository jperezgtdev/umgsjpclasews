package com.umg.repositorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umg.repositorio.entity.Estudiantes;
import com.umg.repositorio.services.IEstudiantes;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
	
	//inyeccion de dependencias
	@Autowired
	protected IEstudiantes estudianteService;

	@GetMapping("/findAll")
	public ResponseEntity<List<Estudiantes>> findAll(){
		return ResponseEntity.ok(estudianteService.findAll());
	}
	
	@PostMapping("/save")
	public ResponseEntity<Estudiantes> save(@RequestBody Estudiantes estudiante){
		return ResponseEntity.ok(estudianteService.save(estudiante));
	}
	
}
