package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Moniteur;
import tn.esprit.nids.dhiagabtni.repository.MoniteurRepository;

import java.util.List;

@Service
public class MoniteurServiceImpl implements IMoniteurService{
    final MoniteurRepository moniteurRepository;

    public MoniteurServiceImpl(MoniteurRepository moniteurRepository) {this.moniteurRepository = moniteurRepository;}

    public List<Moniteur> retrieveAllMoniteurs(){
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    public Moniteur retrieveMoniteur(Long idMoniteur){
        return moniteurRepository.findById(idMoniteur).get();
    }

    public Moniteur addMoniteur(Moniteur M){
        return moniteurRepository.save(M);
    }

    public Moniteur modifyMoniteur(Moniteur M){
        return moniteurRepository.save(M);
    }

    public void removeMoniteur(Long idMoniteur){
        moniteurRepository.deleteById(idMoniteur);
    }
}
