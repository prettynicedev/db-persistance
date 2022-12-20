package mx.com.aforeazteca.dbpersistence.dao;

import mx.com.aforeazteca.dbpersistence.model.GenericResponse;
import mx.com.aforeazteca.dbpersistence.model.RequestModel;

public interface ConsultaDao {

	public GenericResponse consultaSP(RequestModel requestDBP);

}
