package com.tuempresa.cine.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Clientes {
	
	@Id
	@Column(length = 32)
	String id;
	
	@Column(length = 32)
	@Required
	String nombre;
	
	@Column(length = 2)
	int edad;
	
	@Column(length = 20)
	String genero;
	
	

	
	

}
