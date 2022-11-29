package com.tuempresa.cine.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Boletos  {
@Id
@Column(length=32)
String id;

@Money
BigDecimal costo;

@Column(length=32)
String asiento;

}
