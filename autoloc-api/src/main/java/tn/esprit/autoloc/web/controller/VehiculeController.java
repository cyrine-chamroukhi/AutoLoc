package tn.esprit.autoloc.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicule")
@RequiredArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @GetMapping("/retrieve-vehicule/{idVehicule}")
    public Vehicule retrieveVehicule(
            @PathVariable Long idVehicule) {
        return vehiculeService.retrieveVehicule(idVehicule);
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(
            @RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(
            @RequestBody Vehicule vehicule) {
        return vehiculeService.modifyVehicule(vehicule);
    }

    @DeleteMapping("/remove-vehicule/{idVehicule}")
    public void removeVehicule(
            @PathVariable Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }
}