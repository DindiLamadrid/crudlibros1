package com.co.ias.crudlibros.controller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Libros {
    @Id
    @Column
    private int libroid;
    @Column
    private String nombrelibro;
    @Column
    private String autor;
    @Column
    private String multa;


    public Libros(int libroid, String nombrelibro, String autor, String multa) {
        this.libroid = libroid;
        this.nombrelibro = nombrelibro;
        this.autor = autor;
        this.multa = multa;
    }

    public Libros() {

    }

    public int getLibroid() {
        return libroid;
    }

    public void setLibroid(int libroid) {
        this.libroid = libroid;
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }
}
