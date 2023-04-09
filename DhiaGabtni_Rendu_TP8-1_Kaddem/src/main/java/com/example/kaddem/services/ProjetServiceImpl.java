package com.example.kaddem.services;

import com.example.kaddem.entities.Projet;
import com.example.kaddem.entities.ProjetDetail;
import com.example.kaddem.repositories.ProjetDetailRepository;
import com.example.kaddem.repositories.ProjetRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjetServiceImpl implements IProjetService{
    final ProjetRepository projetRepository;
    final ProjetDetailRepository projetDetailRepository;

    public ProjetServiceImpl(ProjetRepository projetRepository, ProjetDetailRepository projetDetailRepository) {
        this.projetRepository = projetRepository;
        this.projetDetailRepository = projetDetailRepository;
    }

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
}
