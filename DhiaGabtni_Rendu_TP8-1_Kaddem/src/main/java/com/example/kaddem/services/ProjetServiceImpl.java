package com.example.kaddem.services;

import com.example.kaddem.entities.Equipe;
import com.example.kaddem.entities.Projet;
import com.example.kaddem.entities.ProjetDetail;
import com.example.kaddem.repositories.EquipeRepository;
import com.example.kaddem.repositories.ProjetDetailRepository;
import com.example.kaddem.repositories.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetServiceImpl implements IProjetService{
    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    ProjetDetailRepository projetDetailRepository;
    @Autowired
    EquipeRepository equipeRepository;


public Projet addProjetAndProjetDetailAndAssign(Projet projet){
        return projetRepository.save(projet);
}

public void assignProjetDetailToProjet(Long projetId, Long projetDetailId){
    Projet projet = projetRepository.findById(projetId).get();
    ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
    projet.setProjetDetail(projetDetail);
    projetRepository.save(projet);
}

public void assignProjetToEquipe(Long equipeId, Long projetId){
    Projet projet = projetRepository.findById(projetId).get();
    Equipe equipe = equipeRepository.findById(equipeId).get();
// on set le fils dans le parent :
    equipe.getProjets().add(projet);
    equipeRepository.save(equipe);
}

public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId){
    ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
    projet.setProjetDetail(projetDetail);
    return projetRepository.save(projet);
}

public Projet DesaffecterProjetDetailFromProjet(Long projetId){
    Projet projet = projetRepository.findById(projetId).get();
    projet.setProjetDetail(null);
    return projetRepository.save(projet);
}

public void desaffecterProjetFromEquipe(Long projetId, Long equipeId){
    Projet projet = projetRepository.findById(projetId).get();
    Equipe equipe = equipeRepository.findById(equipeId).get();
// on enlève le fils du parent :
    equipe.getProjets().remove(projet);
    equipeRepository.save(equipe);
}
}
