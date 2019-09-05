package tomiv.projects.AdManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ad4rentroom")
public class Ad4RentRoom extends Ad {

    @Id
    @Column
    private long id;

    @Column
    private int monthlyFee;

    @Column
    private int monthlyOverhead;

    @Column
    private boolean isSmoker;

    @Column
    private int residents;

    @Column
    private Gender genderSeek;

    public Ad4RentRoom() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthlyOverhead() {
        return monthlyOverhead;
    }

    public void setMonthlyOverhead(int monthlyOverhead) {
        this.monthlyOverhead = monthlyOverhead;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
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
