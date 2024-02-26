package com.nttdata.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.nttdata.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
