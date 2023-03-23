package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Cours;
import tn.esprit.nids.dhiagabtni.repository.CoursRepository;

import java.util.List;

@Service
public class CoursServiceImpl implements ICoursService {
    final
    CoursRepository coursRepository;

    public CoursServiceImpl(CoursRepository coursRepository){
        this.coursRepository = coursRepository;
    }

    public List<Cours> retrieveAllCours(){

        return (List<Cours>) coursRepository.findAll();
    }

    public Cours retrieveCours (Long idCours) {return coursRepository.findById(idCours).get();}
    public Cours addCours(Cours c) {return coursRepository.save(c);}
    public void removeCours(Long idCours) {coursRepository.deleteById(idCours);}
    public Cours modifyCours (Cours cours) {return coursRepository.save(cours);}
}
