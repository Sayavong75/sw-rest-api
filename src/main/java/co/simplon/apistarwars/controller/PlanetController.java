package co.simplon.apistarwars.controller;

import co.simplon.apistarwars.model.Planet;
import co.simplon.apistarwars.repository.PlanetRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/api/planets")

public class PlanetController {

    private PlanetRepository planetRepository;

    public PlanetController(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @GetMapping("/planetsAll")
    public List<Planet> getPlanetList() {
        return planetRepository.findAll();
    }

    @PostMapping("/addPlanet")
    public ResponseEntity<Planet> postPlanet(@RequestBody Planet planet) {
        planetRepository.save(planet);
        return ResponseEntity.ok(planet);
        // return ResponseEntity.ok(planetRepository.save(planet));
    }

    // @RequestMapping identique à @GetMapping
    @RequestMapping("/planetsById/{planetId}")
    public ResponseEntity<Planet> getPlanet(@PathVariable Long planetId){
        Optional<Planet> planet = planetRepository.findById(planetId);
        if (planet.isPresent()) {
            return ResponseEntity.ok(planet.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/updatePlanet/{planetId}")
    public ResponseEntity<Planet> updatePlanet(@RequestBody Planet planet, @PathVariable long planetId) {
        Optional<Planet> planetUp = planetRepository.findById(planetId);
        if (!planetUp.isPresent())
            return ResponseEntity.notFound().build();
        planet.setId(planetId);
        planetRepository.save(planet);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deletePlanet/{planetId}")
    public ResponseEntity<Planet> deletePlanet(@PathVariable Long planetId) {
        planetRepository.deleteById(planetId);
        return ResponseEntity.noContent().build();
    }
}
