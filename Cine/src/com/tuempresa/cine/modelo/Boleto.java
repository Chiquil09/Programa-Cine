package com.tuempresa.cine.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Boleto {
	@Id
	@Column(length = 32)
	String id;
	
	@Column(length = 32)
	int costo;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	Pelicula pelicula;
	
	@Embedded @NoFrame
	Asientos asiento;
	
}
