package dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "per_emp")
@AttributeOverrides(
    {
        @AttributeOverride(name = "id", column= @Column(name = "p_id")),
        @AttributeOverride(name = "name", column= @Column(name = "p_name"))
    }
)
public class per_emp extends Employee{
    float sal;
    float bonus;

    public per_emp() {
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
}
