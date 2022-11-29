package com.tuempresa.cine.modelo;

import java.sql.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pelicula{
	@Id
	@Column(length =32)
	String id;
	
	@Column(length = 32)
	String nombre;
	

	
    @Column(length =32)
    Time hora;
     
}
