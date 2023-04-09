package com.example.kaddem.controllers;

import com.example.kaddem.entities.Projet;
import com.example.kaddem.services.IProjetService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/projet")
public class ProjetRESTController {
final IProjetService projetService;

    public ProjetRESTController(IProjetService projetService) {
        this.projetService = projetService;
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
}
