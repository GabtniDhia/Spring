package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.nids.dhiagabtni.Service.ISkieurService;
import tn.esprit.nids.dhiagabtni.entity.Cours;
import tn.esprit.nids.dhiagabtni.entity.Skieur;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurRestController {
    final ISkieurService skieurService;

    public SkieurRestController(ISkieurService skieurService) {
        this.skieurService = skieurService;
    }
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieur(){
        List<Skieur> listSkieur = skieurService.retrieveAllSkieurs();
        return listSkieur;
    }
    @GetMapping("/retrieve-skieur/{skieur-id}")
    public Skieur retrieveSkieur(@PathVariable("skieur-id") Long skieurId){
        Skieur skieur = skieurService.retrieveSkieurs(skieurId);
        return skieur;
    }
    @PostMapping("add-skieur")
    public Skieur addSkieur(@RequestBody Skieur c){
        Skieur skieur = skieurService.addSkieurs(c);
        return skieur;
    }
    @DeleteMapping("/remove-skieur/{skieur-id}")
    public void removeSkieur(@PathVariable("skieur-id") Long skieurId){
        skieurService.removeSkieurs(skieurId);
    }

    @PutMapping("/modify-skieur")
    public Skieur modifySkieur(@RequestBody Skieur c){
        Skieur skieur = skieurService.modifySkieurs(c);
        return skieur;
    }
}
