package tn.esprit.nids.dhiagabtni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.nids.dhiagabtni.entity.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends CrudRepository<Cours,Long> {
   /* @Query("SELECT c FROM Cours c WHERE c.support = 'SNOWBOARD' ")
    List<Cours> findAllCoursSnow();*/
}
