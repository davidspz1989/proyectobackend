package com.sistema.examenes.repositorio;

import com.sistema.examenes.entidades.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
}
