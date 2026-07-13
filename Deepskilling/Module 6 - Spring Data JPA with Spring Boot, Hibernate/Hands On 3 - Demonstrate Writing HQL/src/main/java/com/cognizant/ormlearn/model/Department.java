package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="department")
@Getter
@Setter
public class Department{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="dp_id")
    private int id;

    @Column(name="dp_name")
    private String name;

    /*
    Lazy fetch
    @OneToMany(mappedBy = "department")
     */
    @OneToMany(
            mappedBy = "department"
    )
    private Set<Employee> employeeList;

    @Override
    public String toString() {
        return "Department {" + "id=" + id +", name="+name+" }";
    }
}
