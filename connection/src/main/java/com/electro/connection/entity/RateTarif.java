package com.electro.connection.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RateTarif {

	@Id
	Long id;
	String type;
	Float rate;				
	String typeConnection;
	String voltageLevel;
	String unitLevel;

	public String getVoltageLevel() {
		return voltageLevel;
	}

	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
	}

	public String getUnitLevel() {
		return unitLevel;
	}

	public void setUnitLevel(String unitLevel) {
		this.unitLevel = unitLevel;
	}

	public String getTypeConnection() {
		return typeConnection;
	}

	public void setTypeConnection(String typeConnection) {
		this.typeConnection = typeConnection;
	}

	public String getVolategLevel() {
		return voltageLevel;
	}

	public void setVolategLevel(String volategLevel) {
		this.voltageLevel = volategLevel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public RateTarif(Long id, String type, Float rate) {
		super();
		this.id = id;
		this.type = type;
		this.rate = rate;
	}

	public RateTarif() {
		super();
	}
	
}
