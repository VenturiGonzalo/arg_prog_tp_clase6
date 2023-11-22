package com.argentinaprograma.ejercicio6.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name="proveedor")
public class Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private String email;

    private String disponibilidad;

    private String radioCobertura;

    private LocalDate fechaNacimiento;

    private String tipoDoc;

    private long nroDoc;

    private long cuit;

    private String telefono;

    private String horario;
}
