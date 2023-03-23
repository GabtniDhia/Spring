package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.nids.dhiagabtni.Service.IInsciptionService;
import tn.esprit.nids.dhiagabtni.entity.Inscription;

import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionRestController {

    final IInsciptionService insciptionService;


    public InscriptionRestController(IInsciptionService insciptionService){this.insciptionService = insciptionService;}



    @GetMapping("/retrieve-all-insc")
    public List<Inscription> getInscs(){
        List<Inscription> listInsc = insciptionService.retrieveAllInscriptions();
        return listInsc;
    }

    @GetMapping("/retrieve-insc/{insc-id}")
    public Inscription retrieveInsc(@PathVariable("insc-id") Long inscID){
        Inscription insc = insciptionService.retrieveInscriptions(inscID);
        return insc;
    }

    @PostMapping("add-insc")
    public Inscription addInsc(@RequestBody Inscription I){
        Inscription insc = insciptionService.addInscriptions(I);
        return insc;
    }

    @DeleteMapping("/remove-insc/{insc-id}")
    public void removeCours(@PathVariable("insc-id") Long inscID){
        insciptionService.removeInscriptions(inscID);
    }

    @PutMapping("/modify-insc")
    public Inscription modifyInsc(@RequestBody Inscription I){
        Inscription insc = insciptionService.modifyInscriptions(I);
        return insc;
    }
}
