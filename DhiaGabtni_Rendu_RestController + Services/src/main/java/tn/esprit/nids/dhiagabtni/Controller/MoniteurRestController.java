package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.nids.dhiagabtni.Service.IMoniteurService;
import tn.esprit.nids.dhiagabtni.entity.Cours;
import tn.esprit.nids.dhiagabtni.entity.Moniteur;

import java.util.List;

@RestController
@RequestMapping("/moniteur")
public class MoniteurRestController {
    final IMoniteurService moniteurService;

    public MoniteurRestController(IMoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }

    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs(){
        List<Moniteur> listMons = moniteurService.retrieveAllMoniteurs();
        return listMons;
    }

    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur getMoniteur(@PathVariable("moniteur-id") Long id){
        Moniteur m = moniteurService.retrieveMoniteur(id);
        return m;
    }

    @PostMapping ("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m){
        Moniteur mon = moniteurService.addMoniteur(m);
        return mon;
    }

    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMon(@PathVariable("moniteur-id") Long monID){
        moniteurService.removeMoniteur(monID);
    }

    @PutMapping("/modify-moniteur")
    public Moniteur modifyCours(@RequestBody Moniteur m){
        Moniteur mon = moniteurService.modifyMoniteur(m);
        return mon;
    }
}
