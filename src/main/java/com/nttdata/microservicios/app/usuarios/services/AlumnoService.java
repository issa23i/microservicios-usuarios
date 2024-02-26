package com.nttdata.microservicios.app.usuarios.services;


import java.util.List;

import com.nttdata.microservicios.commons.alumnos.models.entity.Alumno;
import com.nttdata.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno> {

	public List<Alumno> findByNombreOApellido(String text);
}
