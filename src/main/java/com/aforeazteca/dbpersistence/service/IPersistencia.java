package com.aforeazteca.dbpersistence.service;

import com.aforeazteca.dbpersistence.model.GenericResponse;
import com.aforeazteca.dbpersistence.model.RequestModel;

public interface IPersistencia {
	
	public GenericResponse consumeSP(RequestModel inpu);

}
