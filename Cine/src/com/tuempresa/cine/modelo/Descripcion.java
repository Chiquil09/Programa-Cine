package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;
@Entity @Getter @Setter
public class Descripcion extends Identificable{
	
	@Column(length = 32)
	String descripcion;
}
