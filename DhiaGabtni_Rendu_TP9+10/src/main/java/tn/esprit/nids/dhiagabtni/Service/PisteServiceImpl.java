package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Couleur;
import tn.esprit.nids.dhiagabtni.entity.Piste;
import tn.esprit.nids.dhiagabtni.repository.PisteRepository;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PisteServiceImpl implements IPisteService {

    final
    PisteRepository pisteRepository;

    public PisteServiceImpl(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }
    public Piste retrievePiste(Integer pisteId) {
        return pisteRepository.findById(pisteId).get();
    }
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }
    public void removePiste(Integer pisteId) {
        pisteRepository.deleteById(pisteId);
    }
    public Piste modifyPiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    public List<Piste> recupererPistesSelonCouleur(Couleur couleur){return (List<Piste>) pisteRepository.findDistinctByCouleur(couleur);}
    public List<Piste> recupererPistesSelonPenteEtLongeur(Integer pente, Integer longeur){return pisteRepository.findDistinctByPenteLessThanAndLongeurGreaterThan(pente,longeur);}
}
