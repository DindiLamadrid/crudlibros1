package com.gestionbiblioteca.repository;

import com.gestionbiblioteca.dto.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends JpaRepository<Libro, Integer> {
}
