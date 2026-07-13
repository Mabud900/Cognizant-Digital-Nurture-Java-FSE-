package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "attempt_question")
public class AttemptQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attempt_question_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "attempt_id")
    private Attempt attempt;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany(mappedBy = "attemptQuestion")
    private Set<AttemptOption> attemptOptionList;
}