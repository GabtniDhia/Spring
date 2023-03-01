package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.Cours;
import tn.esprit.nids.dhiagabtni.entity.Inscription;
import tn.esprit.nids.dhiagabtni.entity.Skieur;

import java.util.List;

@Repository
public interface SkieurRepository extends CrudRepository<Skieur,Long>{
    List<Skieur> findDistinctByInscriptionsIn(List<Inscription> InscriptionSnow);
}
