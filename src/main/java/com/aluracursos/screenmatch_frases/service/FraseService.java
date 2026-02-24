package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.model.FraseDTO;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        return repository.obtenerFraseAleatoria();
    }
}
