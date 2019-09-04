package tomiv.projects.AdManager.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@MappedSuperclass
public abstract class Ad {

    private String description;
    private String settlement;
    private Date movable;
}
