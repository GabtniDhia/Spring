package tn.esprit.nids.dhiagabtni.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Couleur;
import tn.esprit.nids.dhiagabtni.entity.Piste;
import tn.esprit.nids.dhiagabtni.repository.PisteRepository;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
public class PisteServiceImpl implements IPisteService {

    final
    PisteRepository pisteRepository;

    public PisteServiceImpl(PisteRepository pisteRepository) {
        this.pisteRepository = pisteRepository;
    }
    @Scheduled(fixedRate = 60000)
    public List<Piste> retrieveAllPistes() {

        ArrayList<Piste> Pista = (ArrayList<Piste>) pisteRepository.findAll();
        for (Piste p: Pista)
        {
            log.info("La Piste: " + p);
        }
        return Pista;
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
