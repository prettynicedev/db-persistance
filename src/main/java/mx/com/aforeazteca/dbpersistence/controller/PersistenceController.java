package mx.com.aforeazteca.dbpersistence.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.aforeazteca.dbpersistence.model.GenericResponse;
import mx.com.aforeazteca.dbpersistence.model.RequestModel;
import mx.com.aforeazteca.dbpersistence.service.IPersistencia;

/**
 * <b>HuellasController.java</b>
 * 
 * @version: Superapp 1.0
 * @descripcion: Controller de persistencia a la BBDD
 * @author 10032942
 * @ultimaModificacion:
 *
 */

@RestController
@RequestMapping("/consultarSP")
public class PersistenceController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersistenceController.class);
	
	@Autowired
	private IPersistencia persistencia;
	
//	@GetMapping(path = "/user")
//	@ResponseStatus(HttpStatus.OK)
////	@Profiled
//	public Object consultarUsuario(@RequestBody RequestModel model){
//		LOGGER.info("Controller consultaUsuario init");
//		
//		//init tiempo
//		return persistencia.consultaSP(model);
//		//end tiempo 
//		//end - int 0.01 mm
//	}
	
	@PostMapping(path="/consumesStoreProc") //poner como constantes
	public GenericResponse persistenciaBD(@RequestBody RequestModel inpu) {

		LOGGER.info("Controller persistenciaBD init");
		GenericResponse respue;
		
		respue = persistencia.consumeSP(inpu);
		
		System.out.println("**" + respue);
		
//		throw new ApiExcepcion(Arrays.asList(AppConstants.MSJ_ERROR_SERVER), EMensajeException.E500);
		return respue;
		
	}

}
