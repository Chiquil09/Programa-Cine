package com.tuempresa.cine.modelo;

import javax.persistence.*;

import lombok.*;

@Getter @Setter @Entity
public class Genero {
 @Id
 @Column(length=32)
 String id ;
 
 @Column(length=32)
 String genero;

}
