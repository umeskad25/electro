package com.electro.connection.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeConnection {


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConnectionType() {
		return ConnectionType;
	}

	public void setConnectionType(String connectionType) {
		ConnectionType = connectionType;
	}

	public TypeConnection() {
		super();
	}

	public TypeConnection(Long id,String type ) {
		super();
		this.id = id;
		this.ConnectionType = type;
	}

	@Id
	Long id;

	String ConnectionType;
}
