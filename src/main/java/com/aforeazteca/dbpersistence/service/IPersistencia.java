package com.aforeazteca.dbpersistence.service;

import com.aforeazteca.dbpersistence.model.GenericResponse;
import com.aforeazteca.dbpersistence.model.RequestModel;

public interface IPersistencia {
	
	public Object consultaSP(RequestModel model);
	public GenericResponse<?> consumeSP(RequestModel inpu);

}
