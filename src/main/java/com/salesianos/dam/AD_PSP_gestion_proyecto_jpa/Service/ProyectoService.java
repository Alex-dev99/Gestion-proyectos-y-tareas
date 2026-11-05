package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.Service;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.Repository.ProyectoRepository;
import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model.Proyecto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public List<Proyecto> listarTodos() {
        return proyectoRepository.findAll();
    }

}
