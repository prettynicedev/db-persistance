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
		
//		Unirest.setTimeouts(0, 0);
//		HttpResponse<String> response = Unirest.post("http://10.112.13.162:8080/consultarSP/consumesStoreProc")
//		  .header("Content-Type", "application/json")
//		  .body("{\r\n  \"packageSP\": \"PA_OP19AFMOVIL\",\r\n  \"process\": \"SPTARETVOLMAESTRAENVARCH\",\r\n  \"params\": [\r\n      {\r\n          \"name\":\"pa_foliomaestra\",\r\n          \"value\": \"202211155479000000000000000000\",\r\n          \"tipoParam\":\"IN\"\r\n      },\r\n      {\r\n          \"name\":\"pa_estatus\",\r\n          \"value\": 1,\r\n          \"tipoParam\":\"IN\"\r\n      },\r\n      {\r\n          \"name\":\"pa_codigo\",\r\n          \"value\": 1,\r\n          \"tipoParam\":\"OUT\"\r\n      },\r\n      {\r\n          \"name\":\"pa_mensaje\",\r\n          \"value\": \"\",\r\n          \"tipoParam\":\"\"\r\n      }\r\n  ]\r\n}")
//		  .asString();
		
		resp = consulta.consultaSP(inpu);
				
		return resp;
	}

}
