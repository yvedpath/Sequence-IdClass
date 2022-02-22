package com;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@IdClass(EmployeePK.class)
public class Employee {
	
@Id 
@Column(name="keyOne")
private int keyOne;
public Employee() { 
}   
public Employee(int keyOne) {
super();
this.keyOne = keyOne;
}
public int getKeyOne() {
    return keyOne; 
}
public void setKeyOne(int keyOne) { 
    this.keyOne = keyOne; 
}

}
