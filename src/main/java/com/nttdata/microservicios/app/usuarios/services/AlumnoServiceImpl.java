package com.nttdata.microservicios.app.usuarios.services;


import org.springframework.stereotype.Service;

import com.nttdata.microservicios.app.usuarios.models.entity.Alumno;
import com.nttdata.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.nttdata.microservicios.commons.services.CommonServiceImpl;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
