package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.HashSet;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Etiqueta {

    @Id
    @GeneratedValue
    private Long id;

    private  String nombre;


    /*@ManyToMany(mappedBy = "etiquetas")
    private Set<Tarea> tareas = new HashSet<>();*/

}
