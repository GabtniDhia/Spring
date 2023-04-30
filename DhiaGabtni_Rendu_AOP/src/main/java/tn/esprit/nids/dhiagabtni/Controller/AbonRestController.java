package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.nids.dhiagabtni.Service.IAbonService;
import tn.esprit.nids.dhiagabtni.entity.Abonnement;

import java.util.List;

@RestController
@RequestMapping("/abon")
public class AbonRestController {

    final IAbonService abonService;

    public AbonRestController(IAbonService abonService) {
        this.abonService = abonService;
    }

    @GetMapping("/retrieve-all-abons")
    public List<Abonnement> getAbons(){
        List<Abonnement> listAbons = abonService.retrieveAllAbons();
        return listAbons;
    }

    @GetMapping("/retrieve-abon/{abon-id}")
    public Abonnement getAbonnement(@PathVariable("abon-id") Long id){
        Abonnement m = abonService.retrieveAbon(id);
        return m;
    }

    @PostMapping("/add-abon")
    public Abonnement addAbon(@RequestBody Abonnement m){
        Abonnement mon = abonService.addAbon(m);
        return mon;
    }

    @DeleteMapping("/remove-abon/{abon-id}")
    public void removeMon(@PathVariable("abon-id") Long monID){
        abonService.removeAbon(monID);
    }

    @PutMapping("/modify-abon")
    public Abonnement modifyCours(@RequestBody Abonnement m){
        Abonnement mon = abonService.modifyAbon(m);
        return mon;
    }
}
