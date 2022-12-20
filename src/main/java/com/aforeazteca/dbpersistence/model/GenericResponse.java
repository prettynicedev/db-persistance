package com.aforeazteca.dbpersistence.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * <b>GenericResponse.java</b>
 * 
 * @version: Superapp 1.0
 * @descripcion: Modelo de Respuesta generica
 * @author 10032942
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponse {
	
	/**
	 * mensaje.
	 */
	private String mensaje;
	/**
	 * folio.
	 */
	private String folio;
	/**
	 * resultado.
	 */
	private Object resultado;

	/**
	 * 
	 */
	public GenericResponse() {
		super();
	}

	/**
	 * @param mensaje
	 * @param folio
	 * @param resultado
	 */
	public GenericResponse(String mensaje, String folio, Object resultado) {
		super();
		this.mensaje = mensaje;
		this.folio = folio;
		this.resultado = resultado;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}

	/**
	 * @param folio the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}

	/**
	 * @return the resultado
	 */
	public Object getResultado() {
		return resultado;
	}

	/**
	 * @param resp the resultado to set
	 */
	public void setResultado(Object resp) {
		this.resultado = resp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GenericInsertResponse [mensaje=" + mensaje + ", folio=" + folio + ", resultado=" + resultado + "]";
	}

}
