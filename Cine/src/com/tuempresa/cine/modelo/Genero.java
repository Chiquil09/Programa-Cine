package com.tuempresa.cine.modelo;
import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter 
public class Genero {
 @Id
 @Hidden
 @GeneratedValue(generator = "system-uuid")
 @GenericGenerator(name = "system-uuid",strategy = "uuid")
 @Column(length=32)
 String oid ;
 
 @Column(length=32)
 String genero;

}
