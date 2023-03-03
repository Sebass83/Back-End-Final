package com.sebastiansantos.backend.repository;

import com.sebastiansantos.backend.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
