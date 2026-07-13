package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private int id;

    @Column(name = "option_text")
    private String optionText;

    @Column(name = "score")
    private double score;

    @Column(name = "correct_answer")
    private boolean correctAnswer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}