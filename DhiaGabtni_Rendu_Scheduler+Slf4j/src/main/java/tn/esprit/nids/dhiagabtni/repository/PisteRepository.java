package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.*;

import java.util.List;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Integer> {
    List<Piste> findDistinctByCouleur (Couleur couleur);
    List<Piste> findDistinctByPenteLessThanAndLongeurGreaterThan(Integer penter, Integer longeur);
}
