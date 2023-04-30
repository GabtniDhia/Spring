package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur retrieveMoniteur(Long idMoniteur);
    Moniteur addMoniteur(Moniteur m);
    Moniteur modifyMoniteur(Moniteur m);
    void removeMoniteur(Long m);
}
