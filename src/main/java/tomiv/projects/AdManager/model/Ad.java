package tomiv.projects.AdManager.model;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
abstract class Ad {

    private String description;
    private String settlement;
    private LocalDate movable;
    private LocalDateTime created;
    private boolean deleted;

    public Ad() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public LocalDate getMovable() {
        return movable;
    }

    public void setMovable(LocalDate movable) {
        this.movable = movable;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
