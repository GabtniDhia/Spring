package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.Abonnement;

@Repository
public interface AbonnementRepository extends CrudRepository<Abonnement,Long>{

}
