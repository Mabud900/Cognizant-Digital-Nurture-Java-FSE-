package com.cognizant.ormlearn.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="skill")
@Getter
@Setter
public class Skill {

    @Id
    @Column(name="sk_id")
    private int id;

    @Column(name="sk_name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;


    @Override
    public String toString(){
        return "Skill {"+"id="+id+", name="+name+" }";
    }
}
