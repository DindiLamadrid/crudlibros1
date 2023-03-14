package com.gestionbiblioteca.repository;

import com.gestionbiblioteca.dto.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Libro, Integer> {
}
