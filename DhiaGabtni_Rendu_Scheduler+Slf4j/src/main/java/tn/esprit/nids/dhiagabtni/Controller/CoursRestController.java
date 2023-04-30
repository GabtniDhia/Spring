package tn.esprit.nids.dhiagabtni.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.nids.dhiagabtni.Service.ICoursService;
import tn.esprit.nids.dhiagabtni.entity.Cours;

import java.util.List;

@RestController
@RequestMapping("/cours")

public class CoursRestController {
    final ICoursService coursService;

    public CoursRestController(ICoursService coursService){
        this.coursService = coursService;
    }

    @GetMapping("/retrieve-all-cours")
    public List<Cours> getCours(){
        List<Cours> listCours = coursService.retrieveAllCours();
        return listCours;
    }

    @GetMapping("/retrieve-cours/{cour-id}")
    public Cours retrieveCours(@PathVariable("cour-id") Long courId){
        Cours cours = coursService.retrieveCours(courId);
        return cours;
    }

    @PostMapping("add-cours")
    public Cours addCours(@RequestBody Cours c){
        Cours cours = coursService.addCours(c);
        return cours;
    }

    @DeleteMapping("/remove-cours/{cours-id}")
    public void removeCours(@PathVariable("cours-id") Long courId){
        coursService.removeCours(courId);
    }

    @PutMapping("/modify-cours")
    public Cours modifyCours(@RequestBody Cours c){
        Cours cours = coursService.modifyCours(c);
        return cours;
    }

}
