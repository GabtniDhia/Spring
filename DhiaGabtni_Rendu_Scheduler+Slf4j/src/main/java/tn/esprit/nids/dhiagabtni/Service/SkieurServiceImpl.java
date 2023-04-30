package tn.esprit.nids.dhiagabtni.Service;

import org.springframework.stereotype.Service;
import tn.esprit.nids.dhiagabtni.entity.Inscription;
import tn.esprit.nids.dhiagabtni.entity.Skieur;
import tn.esprit.nids.dhiagabtni.repository.SkieurRepository;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService{
    final SkieurRepository skieurRepository;

    public SkieurServiceImpl(SkieurRepository skieurRepository) {
        this.skieurRepository = skieurRepository;
    }

    public List<Skieur> retrieveAllSkieurs(){return (List<Skieur>) skieurRepository.findAll();}

    public Skieur retrieveSkieurs(Long idSkieur){ return skieurRepository.findById(idSkieur).get();}

    public Skieur addSkieurs(Skieur skieur){return skieurRepository.save(skieur);}

    public void removeSkieurs(Long idSkieur){skieurRepository.deleteById(idSkieur);}

    public Skieur modifySkieurs(Skieur skieur){return skieurRepository.save(skieur);}

}
