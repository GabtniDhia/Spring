package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Piste;
import tn.esprit.nids.dhiagabtni.repository.PisteRepository;

import java.util.List;

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
    public Piste retrievePiste(Long pisteId) {
        return pisteRepository.findById(pisteId).get();
    }
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }
    public void removePiste(Long pisteId) {
        pisteRepository.deleteById(pisteId);
    }
    public Piste modifyPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

}
