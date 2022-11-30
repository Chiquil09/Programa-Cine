package com.tuempresa.cines.modelo;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Genero {
@Id
@Column(length=32)
String id;

@Column(length=32)
String genero;

}
