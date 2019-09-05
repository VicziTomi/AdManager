package tomiv.projects.AdManager.model;

import javax.persistence.*;

@Entity
@Table(name = "ad4rent")
public class Ad4Rent extends Ad {

    @Id
    @Column
    private long id;

    @Column
    private int monthlyFee;

    @Column
    private int monthlyOverhead;

    @Column
    private boolean isSmoker;

    public Ad4Rent() {
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
}