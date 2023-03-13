package com.co.ias.crudlibros.controller;

import com.co.ias.crudlibros.controller.dto.Libros;
import com.co.ias.crudlibros.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibrosController {
    @Autowired
    LibrosService librosService;

    @GetMapping("/libros")
    private List<Libros> getAllLibros(){
        return librosService.getAllLibros();
    }

    @GetMapping("/libro/{libroid}")
    private Libros getLibros(@PathVariable("libroid")int libroid){
        return librosService.getLibrosById(libroid);
    }

    @DeleteMapping("/libro/{libroid}")
    private void deleteLibro(@PathVariable("libroid")int libroid){
        librosService.delete(libroid);
    }

    @PostMapping("/libros")
    private int saveLibro(@RequestBody Libros libros){
        librosService.saveOrUpdate(libros);
        return libros.getLibroid();
    }

    @PutMapping("/libros")
    private Libros update(@RequestBody Libros libros){
        librosService.saveOrUpdate(libros);
        return libros;
    }
}
