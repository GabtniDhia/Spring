package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.Cours;
import tn.esprit.nids.dhiagabtni.entity.Inscription;
import tn.esprit.nids.dhiagabtni.repository.CoursRepository;

import java.util.List;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription,Long>{
//    List<Inscription> findDistinctByCoursIn(List<Cours> CoursSnow);
}
