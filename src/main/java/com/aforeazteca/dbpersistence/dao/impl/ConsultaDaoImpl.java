package com.aforeazteca.dbpersistence.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.aforeazteca.dbpersistence.dao.ConsultaDao;
import com.aforeazteca.dbpersistence.model.RequestModel;

@Repository
public class ConsultaDaoImpl implements ConsultaDao{
	
//	@Autowired
//	@Qualifier("simpleJdbcCall1")
	private SimpleJdbcCall simpleJdbcCall1;

    private JdbcTemplate jdbcTemplate;
    
    public ConsultaDaoImpl(JdbcTemplate jdbcTemplate) {
//		super(jdbcTemplate);
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Object consultaSP(RequestModel model) {
		
		simpleJdbcCall1 = new SimpleJdbcCall(jdbcTemplate).withProcedureName(model.getProcess());
		simpleJdbcCall1.withCatalogName(model.getPackageSP());
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource();
		model.getParams().forEach(item -> {
			((MapSqlParameterSource) sqlParameterSource).addValue(item.getName(), item.getValue());       
		});
		Map<String, Object> result = simpleJdbcCall1.execute(sqlParameterSource);
		System.out.println("Resultado de la consulta: " + result);
		
		return result;
	}

}
