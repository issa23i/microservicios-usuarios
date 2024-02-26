package com.nttdata.microservicios.app.usuarios.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.microservicios.commons.alumnos.models.entity.Alumno;
import com.nttdata.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.nttdata.microservicios.commons.services.CommonServiceImpl;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly=true)
	public List<Alumno> findByNombreOApellido(String text) {
		return repository.findByNombreOApellido(text);
	}

}

