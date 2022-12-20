package mx.com.aforeazteca.dbpersistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.aforeazteca.dbpersistence.dao.ConsultaDao;
import mx.com.aforeazteca.dbpersistence.model.GenericResponse;
import mx.com.aforeazteca.dbpersistence.model.RequestModel;
import mx.com.aforeazteca.dbpersistence.service.IPersistencia;

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
