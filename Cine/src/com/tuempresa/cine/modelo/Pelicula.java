package com.tuempresa.cine.modelo;

import java.sql.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(members = "id, nombre, hora;" +
        "descripcion;"+
        "foto"
        )
public class Pelicula{
	@Id
	@Column(length = 32)
	int id;
	
	@Column(length = 32)
	String nombre;
	
    @Column(length =32)
    Time hora;
    
    @ManyToOne(fetch = FetchType.LAZY,optional = true)
    @DescriptionsList
    Descripcion descripcion;
    
  
    
    @Files
    @Column(length = 32)
    String foto;
    
}
