package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name = "modify")
public class Employee {

    private
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private int add;
//    private String role;

    public Employee(int add) {

        this.add = add;
//        this.role = role;
    }

    public Employee() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAdd() {
        return this.add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

//    public String getRole() {
//        return this.role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee employee))
            return false;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.add, employee.add)
                ;//&& Objects.equals(this.role, employee.role)
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.add);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.add + '\'' + ", role='"  + '\'' + '}';
    }
}