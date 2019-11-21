package com.roasted.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Bean {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("modelerType")
	@Expose
	private String modelerType;
	@SerializedName("DiagnosticOptions")
	@Expose
	private List<DiagnosticOption> diagnosticOptions = null;
	@SerializedName("ObjectName")
	@Expose
	private String objectName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelerType() {
		return modelerType;
	}

	public void setModelerType(String modelerType) {
		this.modelerType = modelerType;
	}

	public List<DiagnosticOption> getDiagnosticOptions() {
		return diagnosticOptions;
	}

	public void setDiagnosticOptions(List<DiagnosticOption> diagnosticOptions) {
		this.diagnosticOptions = diagnosticOptions;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}