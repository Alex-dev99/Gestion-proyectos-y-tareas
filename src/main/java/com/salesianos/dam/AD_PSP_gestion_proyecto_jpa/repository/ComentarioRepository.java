package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.repository;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
