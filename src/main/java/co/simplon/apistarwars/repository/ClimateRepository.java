package co.simplon.apistarwars.repository;
import co.simplon.apistarwars.model.Climate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimateRepository extends JpaRepository<Climate, Long> {
}
