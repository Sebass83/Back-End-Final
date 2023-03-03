package com.sebastiansantos.backend.repository;

import com.sebastiansantos.backend.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Integer> {
    
}
