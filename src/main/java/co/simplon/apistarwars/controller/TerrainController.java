package co.simplon.apistarwars.controller;

import co.simplon.apistarwars.model.Terrain;
import co.simplon.apistarwars.repository.TerrainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/terrains")

public class TerrainController {
//
//    private TerrainRepository terrainRepository;
//
//    public TerrainController(TerrainRepository terrainRepository) {
//        this.terrainRepository = terrainRepository;
//    }
//
//    @GetMapping("/terrains")
//    public List<Terrain> getTerrainList() {
//        return terrainRepository.findAll();
//    }
}

