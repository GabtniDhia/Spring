package com.example.kaddem.controllers;
import com.example.kaddem.repositories.ProjetRepository;

import com.example.kaddem.entities.Projet;
import com.example.kaddem.services.IProjetService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/projet")
public class ProjetRESTController {
final IProjetService projetService;

final ProjetRepository projetRepository;

    public ProjetRESTController(IProjetService projetService, ProjetRepository projetRepository) {
        this.projetService = projetService;
        this.projetRepository = projetRepository;
    }

    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        Projet projet = projetService.addProjetAndProjetDetailAndAssign(p);
        return projet;
    }

    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }

    @PutMapping("/affecter-equipe-a-projet/{equipe-id}/{projet-id}")
    public void assignProjetToEquipe(@PathVariable("equipe-id") Long equipeId,
                                     @PathVariable("projet-id") Long projetId){
        projetService.assignProjetToEquipe(equipeId,projetId);
    }

    @PostMapping("/affecter-projet-equipe/{projetDetail-id}")
    public void addProjetAndAssignProjetToProjetDetail(@RequestBody Projet projet,
                                                       @PathVariable("projetDetail-id") Long projetDetailId){
        projetService.addProjetAndAssignProjetToProjetDetail(projet,projetDetailId);
    }

    @PutMapping("desaffecter-projet-detail/{projet-id}")
    public Projet DesaffecterProjetDetailFromProjet(@PathVariable("projet-id") Long projetId){
        projetService.DesaffecterProjetDetailFromProjet(projetId);
        return projetRepository.findById(projetId).get();
    }

    @PutMapping("desaffecter-projet-equipe/{projet-id}/{equipe-id}")
    public void desaffecterProjetFromEquipe(@PathVariable("projet-id") Long projetId,
                                            @PathVariable("equipe-id") Long equipeId){
        projetService.desaffecterProjetFromEquipe(projetId,equipeId);
    }
}
