package challenge;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author ankit on 8/16/17.
 * @project FullStackChallenge
 */
@Data
@Table(name = "employee")
@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "empId")
    private int empId;
    @Column(name = "role")
    @Size(max = 50)
    private String role;

    private Employee() {}

    public Employee(String name, int empId, String role) {
        this.name = name;
        this.empId = empId;
        this.role = role;
    }
}