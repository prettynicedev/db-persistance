package com.aforeazteca.dbpersistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aforeazteca.dbpersistence.dao.ConsultaDao;
import com.aforeazteca.dbpersistence.model.GenericResponse;
import com.aforeazteca.dbpersistence.model.RequestModel;
import com.aforeazteca.dbpersistence.service.IPersistencia;

@Service
public class PersistenciaImpl implements IPersistencia{
	
	@Autowired
	private ConsultaDao consulta;
	
	private GenericResponse resp;

	@Override
	public GenericResponse consumeSP(RequestModel inpu) {
		// TODO Auto-generated method stub
		
		resp = consulta.consultaSP(inpu);
				
		return resp;
	}

}
