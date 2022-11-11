package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pelicula {

	@Column(length = 32)
	String pelicula;
}
