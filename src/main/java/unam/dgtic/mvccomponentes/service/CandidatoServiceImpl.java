package unam.dgtic.mvccomponentes.service;

import org.springframework.beans.factory.annotation.Autowired;
import unam.dgtic.mvccomponentes.model.Candidato;
import unam.dgtic.mvccomponentes.repository.CandidatoRepository;

import java.util.List;

public class CandidatoServiceImpl implements CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public void altaCandidato(Candidato candidato) {
        candidatoRepository.save(candidato);

    }

    @Override
    public List<Candidato> todosLosCandidatos() {
        return candidatoRepository.findAll();
    }
}
