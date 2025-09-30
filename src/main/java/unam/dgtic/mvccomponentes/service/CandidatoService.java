package unam.dgtic.mvccomponentes.service;

import org.springframework.stereotype.Service;
import unam.dgtic.mvccomponentes.model.Candidato;

import java.util.List;

public interface CandidatoService {
    void altaCandidato(Candidato candidato);
    List<Candidato> todosLosCandidatos();
}
