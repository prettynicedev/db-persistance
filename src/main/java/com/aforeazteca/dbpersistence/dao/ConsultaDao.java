package com.aforeazteca.dbpersistence.dao;

import com.aforeazteca.dbpersistence.model.GenericResponse;
import com.aforeazteca.dbpersistence.model.RequestModel;

public interface ConsultaDao {

	public GenericResponse consultaSP(RequestModel requestDBP);

}
