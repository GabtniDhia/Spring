package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.Moniteur;

@Repository
public interface MoniteurRepository extends CrudRepository<Moniteur,Long> {
}
