package com.roasted.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiagnosticOption {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("origin")
	@Expose
	private String origin;
	@SerializedName("value")
	@Expose
	private String value;
	@SerializedName("writeable")
	@Expose
	private Boolean writeable;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getWriteable() {
		return writeable;
	}

	public void setWriteable(Boolean writeable) {
		this.writeable = writeable;
	}

}