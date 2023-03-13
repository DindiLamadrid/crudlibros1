package com.co.ias.crudlibros.controller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Prestamo {
    @Id
    @Column
    private String nombre;
    private int cantDias;
    private boolean devuelto;

}
