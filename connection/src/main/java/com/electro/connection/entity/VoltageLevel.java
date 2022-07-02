package com.electro.connection.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VoltageLevel {

	@Override
	public String toString() {
		return "VoltageLevel [id=" + id + ", level=" + level + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Id
	Long id;
	
	String level;
}
