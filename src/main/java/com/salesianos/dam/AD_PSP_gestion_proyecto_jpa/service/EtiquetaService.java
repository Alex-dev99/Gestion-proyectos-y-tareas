package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.service;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model.Etiqueta;
import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.repository.EtiquetaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EtiquetaService {
    private final EtiquetaRepository etiquetaRepository;

    @Transactional
    public Etiqueta guardar(Etiqueta etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }

    @Transactional
    public long contar() {
        return etiquetaRepository.count();
    }
}
