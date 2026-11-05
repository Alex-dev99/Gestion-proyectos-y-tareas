package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comentario {


    @Id
    @GeneratedValue
    private Long id;

    private String texto;

    private String autor;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tarea_id")
    private Tarea tarea;*/
}
