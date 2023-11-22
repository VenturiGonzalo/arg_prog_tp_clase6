package com.argentinaprograma.ejercicio6.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="opinion_proveedor")
public class OpinionProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Contrato contrato;

    @OneToOne
    private Prestador prestador;

    private int estrellas;

    private String opinion;
}
