package tomiv.projects.AdManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ad4rentroom")
public class Ad4RentRoom extends Ad4Rent {

    @Id
    @Column
    private long id;

    @Column
    private int residents;

    @Column
    private Gender genderSeek;

    public Ad4RentRoom() throws CloneNotSupportedException {
        super();
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    public Gender getGenderSeek() {
        return genderSeek;
    }

    public void setGenderSeek(Gender genderSeek) {
        this.genderSeek = genderSeek;
    }
}
