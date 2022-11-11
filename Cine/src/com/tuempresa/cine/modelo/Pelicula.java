package com.tuempresa.cine.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Pelicula{
	@Id
	@Column(length = 32)
	String nombre;
	
	@File
	@Column(length = 32)
	String fotografia;
	
	@ManyToOne(fetch = FetchType.LAZY,optional=true)
	@DescriptionsList
	Descripcion descripcion;
}
