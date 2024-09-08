package com.umg.repositorio.repository;

import org.springframework.data.repository.CrudRepository;

import com.umg.repositorio.entity.Estudiantes;

public interface IEstudiantesRepository extends CrudRepository<Estudiantes, Integer> {

}
