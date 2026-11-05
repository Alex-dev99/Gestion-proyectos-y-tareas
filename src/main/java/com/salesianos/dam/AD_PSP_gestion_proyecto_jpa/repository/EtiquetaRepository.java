package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.repository;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends JpaRepository<Etiqueta, Long> {
}
