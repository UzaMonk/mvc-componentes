package unam.dgtic.mvccomponentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unam.dgtic.mvccomponentes.model.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {
}
