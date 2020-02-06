package co.simplon.apistarwars.controller;

import co.simplon.apistarwars.model.Planet;
import co.simplon.apistarwars.repository.PlanetRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.Optional;

@WebMvcTest
public class PlanetControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PlanetRepository planetRepository;

    @Test
    public void getPlanetList() throws Exception {
        when(this.planetRepository.findAll()).thenReturn(new ArrayList<>()); // Le when c'est ce que l'on veut mocker
        this.mockMvc.perform(get("/api/planetes/planetsAll")).andExpect(status().isOk()); // On teste le controller et on attend Ok
    }

    @Test
    public void getPlanetById() throws Exception {
        when(this.planetRepository.findById(2L)).thenReturn(Optional.of(new Planet()));
        this.mockMvc.perform(get("/api/planets/planetsById/2")).andExpect(status().isOk());
    }

    @Test
    public void addPlanet() throws Exception {
        when(this.planetRepository.save(any())).thenReturn(new Planet());
        this.mockMvc
                .perform(post("/api/planets/addPlanet").contentType(MediaType.APPLICATION_JSON) // Format du contenu
                        .content("{\"planetName\": \"TotoPlanet\"}"))
                .andExpect(status().isOk()).andExpect(jsonPath("planetName").value("TotoPlanet"));
    }
    @Test
    public void getExistingPlanetById() throws Exception {
        
    }


}

