package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nids.dhiagabtni.entity.Piste;
import tn.esprit.nids.dhiagabtni.Service.IPisteService;


import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteRestController {
    final
    IPisteService pisteService;

    public PisteRestController(IPisteService pisteService) {
        this.pisteService = pisteService;
    }

    // http://localhost:8089/ski/piste/retrieve-all-pistes
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes() {
        List<Piste> listPistes = pisteService.retrieveAllPistes();
        return listPistes;
    }

    // http://localhost:8089/ski/piste/retrieve-piste/8
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") Integer proejtId) {
        Piste piste = pisteService.retrievePiste(proejtId);
        return piste;
    }

    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = pisteService.addPiste(p);
        return piste;
    }
    // http://localhost:8089/ski/piste/remove-piste/{piste-id}
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Integer proejtId) {
        pisteService.removePiste(proejtId);
    }
    // http://localhost:8089/ski/piste/modify-piste
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        Piste piste = pisteService.modifyPiste(p);
        return piste;
    }
}


