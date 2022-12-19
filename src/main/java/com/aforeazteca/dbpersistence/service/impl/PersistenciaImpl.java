package com.aforeazteca.dbpersistence.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aforeazteca.dbpersistence.dao.ConsultaDao;
import com.aforeazteca.dbpersistence.model.GenericResponse;
import com.aforeazteca.dbpersistence.model.RequestModel;
import com.aforeazteca.dbpersistence.service.IPersistencia;

@Service
public class PersistenciaImpl implements IPersistencia{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersistenciaImpl.class);
	
	@Autowired
	private ConsultaDao consulta;

	@Override
	public Object consultaSP(RequestModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericResponse<?> consumeSP(RequestModel inpu) {
		// TODO Auto-generated method stub
		
		GenericResponse<?> resp;
		
//		resp = consulta.consultaSP(inpu);
		System.out.println(consulta.consultaSP(inpu));
		resp = null;
				
		return resp;
	}

}
