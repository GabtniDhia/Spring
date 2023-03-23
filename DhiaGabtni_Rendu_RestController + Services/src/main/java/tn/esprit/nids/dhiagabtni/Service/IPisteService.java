package tn.esprit.nids.dhiagabtni.Service;

import tn.esprit.nids.dhiagabtni.entity.Piste;

import java.util.List;

public interface IPisteService {
    public List<Piste> retrieveAllPistes();
    public Piste retrievePiste(Integer pisteId);
    public Piste addPiste(Piste p);
    public void removePiste(Integer pisteId);
    public Piste modifyPiste(Piste piste);
// Here we will add later methods calling keywords and methods calling JPQL
}
