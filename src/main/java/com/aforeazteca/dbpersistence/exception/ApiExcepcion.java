package com.aforeazteca.dbpersistence.exception;

import java.util.List;

import com.aforeazteca.dbpersistence.enums.EMensajeException;
import com.aforeazteca.dbpersistence.model.ApiErrorModel;

public class ApiExcepcion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final EMensajeException option;

	private final ApiErrorModel body;

	public ApiExcepcion(String folio, List<String> detalles, EMensajeException option) {
		super(option.getMensaje());
		this.option = option;
		this.body = new ApiErrorModel(option.getCodigo(), option.getMensaje(), folio, option.getInfo(), detalles);

	}

	/**
	 * Constructor
	 * 
	 * @param detalles
	 * @param option
	 */
	public ApiExcepcion(List<String> detalles, EMensajeException option) {
		super();
		this.option = option;
		this.body = new ApiErrorModel(option.getCodigo(), option.getMensaje(), null, option.getInfo(), detalles);
	}

	/**
	 * Get exception
	 * 
	 * @return EMensajeException
	 */
	public EMensajeException getOption() {
		return this.option;
	}

	/**
	 * Get body
	 * 
	 * @return ApiException
	 */
	public ApiErrorModel getBody() {
		return body;
	}

}
