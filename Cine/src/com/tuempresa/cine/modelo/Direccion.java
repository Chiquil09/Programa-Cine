package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Direccion {

	@Id
	String id;
	
	@Column(length=32)
	String calle;
	
	@Column(length=32)
	String pais;
	
	@Column(length=32)
	String colonia;
	
	@Column(length=32)
	String municipio;
	
	@Column(length=32)
	String estado;
}
