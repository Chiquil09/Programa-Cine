package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Asientos {

	@Column(length = 10)
	String id;
	
	@Column(length = 10)
	String asientos;
}
