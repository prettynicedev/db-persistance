package mx.com.aforeazteca.dbpersistence.dao.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import mx.com.aforeazteca.dbpersistence.constants.AppConstants;
import mx.com.aforeazteca.dbpersistence.dao.ConsultaDao;
import mx.com.aforeazteca.dbpersistence.enums.EMensajeException;
import mx.com.aforeazteca.dbpersistence.exception.ApiExcepcion;
import mx.com.aforeazteca.dbpersistence.model.GenericResponse;
import mx.com.aforeazteca.dbpersistence.model.RequestModel;

@Repository
public class ConsultaDaoImpl implements ConsultaDao {

//	@Autowired
//	@Qualifier("simpleJdbcCall1")
	private SimpleJdbcCall simpleJdbcCall1;

	/**
	 * JdbcTemplate jdbcTemplate
	 */
	private JdbcTemplate jdbcTemplate;

	/**
	 * simple jdbc call factory
	 *
	 */
//	private SimpleJdbcCallFactory simpleJdbcCallFactory;
	private GenericResponse resp = new GenericResponse();

	private SqlParameterSource sqlParameterSource;

	public ConsultaDaoImpl(JdbcTemplate jdbcTemplate) {
//		super(jdbcTemplate);
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public GenericResponse consultaSP(RequestModel model) {

		Map<String, Object> result = new HashMap<>();
		sqlParameterSource = new MapSqlParameterSource();

		try {
			simpleJdbcCall1 = new SimpleJdbcCall(jdbcTemplate).withProcedureName(model.getProcess())
					.withCatalogName(model.getPackageSP());
			model.getParams().forEach(item -> {
				((MapSqlParameterSource) sqlParameterSource).addValue(item.getName(), item.getValue());
			});
			
			Object otroResult = simpleJdbcCall1.execute(sqlParameterSource);
			result = simpleJdbcCall1.execute(sqlParameterSource);
			System.out.println(otroResult);
			System.out.println("Resultado de la consulta: " + result);
			
			resp.setMensaje(AppConstants.MSJ_OPERACION_EXITOSA);
			resp.setResultado(result);
			
		}
		catch (Exception e) {
			resp.setMensaje(AppConstants.MSJ_ERROR_SERVER);
			resp.setResultado(e.getMessage());
			
			System.out.println("mensaje : " + e.getMessage());
			
//			throw new ApiExcepcion(Arrays.asList(AppConstants.MSJ_ERROR_SERVER), EMensajeException.E500);
		}

		return resp;
	}

}
