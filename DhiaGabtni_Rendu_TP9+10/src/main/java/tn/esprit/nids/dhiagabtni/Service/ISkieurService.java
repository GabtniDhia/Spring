package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur retrieveSkieurs(Long idSkieur);
    Skieur addSkieurs(Skieur s);
    void removeSkieurs(Long idSkieur);
    Skieur modifySkieurs(Skieur Skieur);
}
