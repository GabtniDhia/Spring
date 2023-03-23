package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Inscription;

import java.util.List;

public interface IInsciptionService {
     List<Inscription> retrieveAllInscriptions();
    Inscription retrieveInscriptions(Long idInscription);
    Inscription addInscriptions(Inscription c);
     void removeInscriptions(Long idInscription);
    Inscription modifyInscriptions(Inscription Inscription);
}
