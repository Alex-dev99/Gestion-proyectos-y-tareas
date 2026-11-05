package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.Service;

import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.Repository.TareaRepository;
import com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model.Tarea;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TareaService {

    private final TareaRepository tareaRepository;

    public Tarea guardar(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public List<Tarea> listarTodos() {
        return tareaRepository.findAll();
    }

    public Tarea buscarPorId(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        tareaRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Tarea mostrarDetalle(Long id) {
        Tarea tarea = buscarPorId(id);
        if (tarea != null) {
            tarea.getComentarios().size();
            tarea.getEtiquetas().size();
        }
        return tarea;
    }
}

}
