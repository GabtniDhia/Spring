package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Abonnement;

import java.util.List;

public interface IAbonService {
     List<Abonnement> retrieveAllAbons();
     Abonnement retrieveAbon(Long idAbon);
     Abonnement addAbon(Abonnement c);
     void removeAbon(Long idAbon);
     Abonnement modifyAbon(Abonnement Abon);
}
