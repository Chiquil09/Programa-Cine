package com.tuempresa.cine.modelo;

import java.sql.*;
import java.time.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Boletos  {
@Id
@Column(length=32)
String id;

@Column(length=32)
String sala;

LocalDate fecha;

@Column(length=5)
Time hora;
}
