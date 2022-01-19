package ru.project.coffee_machine.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "time")
    private LocalDate time;

    @Column(name = "drink")
    private String drink;

    @Column(name = "volume")
    private long volume;

    @Column(name = "sugar")
    private long sugar;

    public Machine() {
        super();
    }

}