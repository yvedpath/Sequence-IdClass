package com;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class EmployeePK implements Serializable{
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="key_1",nullable=false,insertable=false,updatable=false)
    private int keyOne;

    @Override
    public int hashCode() {
            return Objects.hash(keyOne);
    }
    @Override
    public boolean equals(Object obj) {
            if (this == obj)
                    return true;
            if (obj == null)
                    return false;
            if (getClass() != obj.getClass())
                    return false;
            EmployeePK other = (EmployeePK) obj;
            return keyOne == other.keyOne;
    }
    public EmployeePK() {
            }
    public EmployeePK(int keyOne) {
            super();
            this.keyOne = keyOne;
    }

}
