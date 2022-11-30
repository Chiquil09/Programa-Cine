package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Asientos {

	@Column(length = 30)
	int id;
	
	@Column(length = 30)
	int asientos;
}
