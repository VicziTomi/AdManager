package tomiv.projects.AdManager.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ad4sale")
public class Ad4Sale extends Ad {

    @Id
    @SequenceGenerator(name = "ad4SaleGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "ad4SaleGenerator", strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column
    private LocalDate built;

    @Column
    private int targetPrice;

    public Ad4Sale() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBuilt() {
        return built;
    }

    public void setBuilt(LocalDate built) {
        this.built = built;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }
}
