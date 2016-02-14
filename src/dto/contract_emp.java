package dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cntrct_emp")
@AttributeOverrides(
    {
        @AttributeOverride(name = "id", column= @Column(name = "c_id")),
        @AttributeOverride(name = "name", column= @Column(name = "c_name"))
    }
)
public class contract_emp extends Employee{
    /**/
    int workng_hr;
    int days;

    public contract_emp() {
    }
    
    public int getWorkng_hr() {
        return workng_hr;
    }

    public void setWorkng_hr(int workng_hr) {
        this.workng_hr = workng_hr;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    
}
