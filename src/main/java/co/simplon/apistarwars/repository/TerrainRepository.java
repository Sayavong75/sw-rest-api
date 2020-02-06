package co.simplon.apistarwars.repository;
import co.simplon.apistarwars.model.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Long> {
}
