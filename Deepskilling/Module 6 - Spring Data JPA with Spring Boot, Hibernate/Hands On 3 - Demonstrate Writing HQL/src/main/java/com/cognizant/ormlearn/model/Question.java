package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int id;

    @Column(name = "question_text")
    private String questionText;

    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private Set<Option> options;
}