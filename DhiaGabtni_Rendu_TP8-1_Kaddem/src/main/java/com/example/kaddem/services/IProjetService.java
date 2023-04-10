package com.example.kaddem.services;

import com.example.kaddem.entities.Projet;

public interface IProjetService {
    Projet addProjetAndProjetDetailAndAssign(Projet projet);
    void assignProjetDetailToProjet(Long projetId, Long projetDetailId);
    void assignProjetToEquipe(Long equipeId, Long projetId);
    Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);
    Projet DesaffecterProjetDetailFromProjet(Long projetId);
    void desaffecterProjetFromEquipe(Long projetId, Long equipeId);


}
