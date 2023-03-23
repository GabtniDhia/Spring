package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Abonnement;
import tn.esprit.nids.dhiagabtni.repository.AbonnementRepository;

import java.util.List;

@Service
public class AbonServiceImpl implements IAbonService{
    final AbonnementRepository abonnementRepository;

    public AbonServiceImpl(AbonnementRepository abonnementRepository) {
        this.abonnementRepository = abonnementRepository;
    }

    public List<Abonnement> retrieveAllAbons(){
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    public Abonnement retrieveAbon(Long idAbon){
        return abonnementRepository.findById(idAbon).get();
    }

    public Abonnement addAbon(Abonnement M){
        return abonnementRepository.save(M);
    }

    public Abonnement modifyAbon(Abonnement M){
        return abonnementRepository.save(M);
    }

    public void removeAbon(Long idAbon){
        abonnementRepository.deleteById(idAbon);
    }
}
