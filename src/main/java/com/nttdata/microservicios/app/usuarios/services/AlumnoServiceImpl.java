package com.nttdata.microservicios.app.usuarios.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.microservicios.commons.alumnos.models.entity.Alumno;
import com.nttdata.microservicios.app.usuarios.client.CursoFeignClient;
import com.nttdata.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.nttdata.microservicios.commons.services.CommonServiceImpl;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {
	
	@Autowired
	private CursoFeignClient cursoFeignClient;

	@Override
	@Transactional(readOnly=true)
	public List<Alumno> findByNombreOApellido(String text) {
		return repository.findByNombreOApellido(text);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAllById(Iterable<Long> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public void eliminarCursoAlumnoPorId(Long id) {
		cursoFeignClient.eliminarCursoAlumnoPorId(id);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		super.deleteById(id);
		this.eliminarCursoAlumnoPorId(id);
	}
	
}

