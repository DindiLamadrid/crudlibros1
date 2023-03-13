package com.co.ias.crudlibros.service;

import com.co.ias.crudlibros.controller.dto.Libros;
import com.co.ias.crudlibros.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LibrosService {
    @Autowired
    LibrosRepository librosRepository;

    public List<Libros> getAllLibros(){
        List<Libros> libros = new ArrayList<Libros>();
        librosRepository.findAll().forEach(libros1 -> libros.add(libros1));
        return libros;
    }

    public Libros getLibrosById(int id){
        return librosRepository.findById(id).get();
    }

    public void saveOrUpdate(Libros libros){
        librosRepository.save(libros);
    }

    public void delete(int id){
        librosRepository.deleteById(id);
    }
    public void update(Libros libros, int libroid){
        librosRepository.save(libros);
    }
}
