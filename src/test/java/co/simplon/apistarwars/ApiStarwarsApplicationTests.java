package co.simplon.apistarwars;

import co.simplon.apistarwars.model.Planet;
import co.simplon.apistarwars.controller.PlanetController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
//@SpringBootTest
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

class ApiStarwarsApplicationTests {

    // Tests d'intégration

        @Autowired
        private TestRestTemplate restTemplate;

        // Get existing planet
        @Test
        public void getPlanetList() {
            // When getting on /api/planets
            ResponseEntity<List> responseEntity = this.restTemplate.exchange("/api/planets/planetsAll", HttpMethod.GET, null,List.class);
            List<?> planets = responseEntity.getBody();
            // Then we should have a list and a 200 response code
            assertThat(planets).isNotNull();
        }
        // Get non existing planet

        // Create planet

        // Update existing planet

        // Update non existing planet

        // Delete planet

}
