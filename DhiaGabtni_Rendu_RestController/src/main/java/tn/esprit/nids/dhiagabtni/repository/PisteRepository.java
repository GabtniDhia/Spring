package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.*;

import java.util.List;

@Repository
public interface PisteRepository extends CrudRepository<Piste,Long>{
//    List<Piste> findByPenteLessThanAndLongeurGreaterThan(Integer Pente, Integer Longeur);
//
//    List<Piste> findDistinctBySkieursIn(List<Skieur> SkieurSnow);


   /* @Query("SELECT c FROM Cours c WHERE c.support = 'SNOWBOARD' ")
    List<Cours> findAllCoursSnow();
    List<Inscription> findAllByCou*/
}
