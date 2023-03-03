package com.sebastiansantos.backend.repository;

import com.sebastiansantos.backend.model.ProyectHasTecno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectHasTecnoRepository extends JpaRepository<ProyectHasTecno,Integer> {
   
}
