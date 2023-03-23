package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Cours;

import java.util.List;

public interface ICoursService {
    public List<Cours> retrieveAllCours();
    public Cours retrieveCours(Long idCours);
    public Cours addCours(Cours c);
    public void removeCours(Long idCours);
    public Cours modifyCours(Cours Cours);
}
