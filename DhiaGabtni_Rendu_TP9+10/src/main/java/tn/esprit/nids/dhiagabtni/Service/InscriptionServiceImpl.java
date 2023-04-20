package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Couleur;
import tn.esprit.nids.dhiagabtni.entity.Inscription;
import tn.esprit.nids.dhiagabtni.entity.Piste;
import tn.esprit.nids.dhiagabtni.repository.InscriptionRepository;
import tn.esprit.nids.dhiagabtni.repository.PisteRepository;

import java.util.List;

@Service
public class InscriptionServiceImpl implements IInsciptionService{
    final InscriptionRepository inscriptionRepository;

    public InscriptionServiceImpl(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    public List<Inscription> retrieveAllInscriptions(){
        return (List<Inscription>) inscriptionRepository.findAll();
    }

    public Inscription retrieveInscriptions(Long idInscription){ return inscriptionRepository.findById(idInscription).get();}

    public Inscription addInscriptions(Inscription inscription){return inscriptionRepository.save(inscription);}

    public void removeInscriptions(Long idInscription){inscriptionRepository.deleteById(idInscription);}

    public Inscription modifyInscriptions(Inscription inscription){return inscriptionRepository.save(inscription);}

    public Inscription desaffeecterskieurinscription(Long InscrID ){
        Inscription insc2 = inscriptionRepository.findById(InscrID).get().setSkieur(null);
        return inscriptionRepository.save(insc2);
    }



}
