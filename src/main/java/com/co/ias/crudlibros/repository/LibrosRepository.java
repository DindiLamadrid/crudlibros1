package com.co.ias.crudlibros.repository;

import com.co.ias.crudlibros.controller.dto.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends JpaRepository<Biblioteca, Integer> {
}
