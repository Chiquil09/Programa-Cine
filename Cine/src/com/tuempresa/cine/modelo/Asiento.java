package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Asiento {

	@Column(length = 32)
	String asiento;
}
