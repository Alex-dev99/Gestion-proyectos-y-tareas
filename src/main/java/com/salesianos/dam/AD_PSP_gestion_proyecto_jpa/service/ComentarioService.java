package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.service;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.repository.ComentarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComentarioService {

    private final ComentarioRepository comentarioRepository;

    @Transactional()
    public long contar() {
        return comentarioRepository.count();
    }

}
