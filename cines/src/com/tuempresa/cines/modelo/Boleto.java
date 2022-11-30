package com.tuempresa.cines.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Boleto {
  @Id
  @Column(length=32)
  String id;
  
  @Money 
  @Column(length=32)
  BigDecimal costo;
  
  @Column(length=32)
  String asiento;
}
