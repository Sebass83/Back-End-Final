
package com.sebastiansantos.backend.repository;

import com.sebastiansantos.backend.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Integer>{
    
}
