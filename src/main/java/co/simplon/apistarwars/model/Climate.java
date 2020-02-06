package co.simplon.apistarwars.model;
import javax.persistence.*;

@Entity
@Table(name = "climates")
public class Climate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "climate_name")
    private String climateName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClimateName() {
        return climateName;
    }

    public void setClimateName(String climateName) {
        this.climateName = climateName;
    }
}
