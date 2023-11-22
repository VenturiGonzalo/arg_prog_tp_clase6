package com.argentinaprograma.ejercicio6.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_administrador", referencedColumnName = "id")
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_prestador", referencedColumnName = "id")
    private Prestador prestador;

    @OneToMany
    @JoinColumn(name = "id_servicio", referencedColumnName = "id")
    private List<Tarea> tareaList;
}
