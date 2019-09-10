package tomiv.projects.AdManager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "ad4rentroom")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ad4RentRoom extends Ad {

    @Id
    @SequenceGenerator(name = "ad4rentRoomGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "ad4rentRoomGenerator", strategy = GenerationType.SEQUENCE)
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
