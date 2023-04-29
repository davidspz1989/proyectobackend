package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.repositorio.ExamenRepository;
import com.sistema.examenes.servicios.ExamenServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExamenServiceImpl implements ExamenServcie {

    @Autowired
    private  ExamenRepository examenRepository;


    @Override
    public Examen agregarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public Examen actualizarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public Set<Examen> obtenerExamenes() {
        return new  LinkedHashSet<>(examenRepository.findAll());
    }

    @Override
    public Examen obtenerExamen(Long examenId) {
        // RETORNA EL VALOR OBTENIDO
        return examenRepository.findById(examenId).get();
    }

    @Override
    public void eliminarExamen(Long examenId) {
        Examen examen=new Examen();
        examen.setExamenId(examenId);
        examenRepository.delete(examen);
    }
}
