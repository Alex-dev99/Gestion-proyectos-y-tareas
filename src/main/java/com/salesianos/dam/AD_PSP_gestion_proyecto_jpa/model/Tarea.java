package com.salesianos.dam.AD_PSP_gestion_proyecto_jpa.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Tarea {

    @Id @GeneratedValue
    private Long id;

    private String titulo;
    private String estado;

    @ManyToOne
    private Proyecto proyecto;

    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @ToString.Exclude
    private List<Comentario> comentarios = new ArrayList<>();

    @ManyToMany
    @Builder.Default
    @ToString.Exclude
    private List<Etiqueta> etiquetas = new ArrayList<>();


    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
        comentario.setTarea(this);
    }

    public void removeComentario(Comentario comentario) {
        comentarios.remove(comentario);
        comentario.setTarea(null);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Tarea tarea = (Tarea) o;
        return getId() != null && Objects.equals(getId(), tarea.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}