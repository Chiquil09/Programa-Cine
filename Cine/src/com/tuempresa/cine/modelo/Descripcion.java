package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Descripcion {

	@Column(length = 32)
	String genero;
	
	@Column(length = 32)
	String descripcion;
	
	@Column(length = 32)
	String tipo;
	
}
