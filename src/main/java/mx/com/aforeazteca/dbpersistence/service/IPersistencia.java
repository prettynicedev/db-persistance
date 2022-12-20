package mx.com.aforeazteca.dbpersistence.service;

import mx.com.aforeazteca.dbpersistence.model.GenericResponse;
import mx.com.aforeazteca.dbpersistence.model.RequestModel;

public interface IPersistencia {
	
	public GenericResponse consumeSP(RequestModel inpu);

}
