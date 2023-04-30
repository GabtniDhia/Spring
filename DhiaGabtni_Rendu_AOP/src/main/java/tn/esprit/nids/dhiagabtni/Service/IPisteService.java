package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Couleur;
import tn.esprit.nids.dhiagabtni.entity.Piste;

import java.util.List;

public interface IPisteService {
     List<Piste> retrieveAllPistes();
     Piste retrievePiste(Integer pisteId);
     Piste addPiste(Piste p);
     void removePiste(Integer pisteId);
     Piste modifyPiste(Piste piste);
     List<Piste> recupererPistesSelonCouleur(Couleur couleur);
     List<Piste> recupererPistesSelonPenteEtLongeur(Integer penter, Integer longeur);


}
