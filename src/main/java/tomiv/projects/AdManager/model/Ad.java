package tomiv.projects.AdManager.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Ad {

    private String description;
    private String settlement;
    private LocalDate movable;
    private LocalDateTime created;
    private boolean deleted;

}
