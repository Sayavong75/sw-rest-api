package co.simplon.apistarwars.controller;

import co.simplon.apistarwars.model.Climate;
import co.simplon.apistarwars.repository.ClimateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/climates")

public class ClimateController {

//    private ClimateRepository climateRepository;
//
//    public ClimateController(ClimateRepository climateRepository) {
//        this.climateRepository = climateRepository;
//    }
//
//    @GetMapping("/climates")
//    public List<Climate> getClimateList() {
//        return climateRepository.findAll();
//    }
}
