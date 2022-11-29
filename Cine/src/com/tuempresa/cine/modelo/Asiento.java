package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Asiento {
@Id
@Column(length = 32)
String id;

@Column(length = 32)
String num_asiento;
}
