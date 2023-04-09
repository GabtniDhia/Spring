package com.example.kaddem.services;

import com.example.kaddem.entities.Projet;

public interface IProjetService {
    Projet addProjetAndProjetDetailAndAssign(Projet projet);
    void assignProjetDetailToProjet(Long projetId, Long projetDetailId);
}
