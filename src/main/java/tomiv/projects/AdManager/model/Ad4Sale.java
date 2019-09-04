package tomiv.projects.AdManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "ad4sale")
public class Ad4Sale extends Ad {

    @Id
    @Column
    private long id;

    @Column
    private Date built;

    @Column
    private int targetPrice;

    public Ad4Sale() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBuilt() {
        return built;
    }

    public void setBuilt(Date built) {
        this.built = built;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }
}
