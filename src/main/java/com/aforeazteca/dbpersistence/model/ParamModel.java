package com.aforeazteca.dbpersistence.model;

public class ParamModel {
	
	private String name;
	private Object value;
	private String tipoParam;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getTipoParam() {
		return tipoParam;
	}
	public void setTipoParam(String tipoParam) {
		this.tipoParam = tipoParam;
	}

}
