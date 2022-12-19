package com.aforeazteca.dbpersistence.model;

import java.util.List;

public class RequestModel {
	
	private String packageSP;
	private String process;
	private List<ParamModel> params;
	
	public String getPackageSP() {
		return packageSP;
	}
	public void setPackageSP(String packageSP) {
		this.packageSP = packageSP;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public List<ParamModel> getParams() {
		return params;
	}
	public void setParams(List<ParamModel> params) {
		this.params = params;
	}
	
}
