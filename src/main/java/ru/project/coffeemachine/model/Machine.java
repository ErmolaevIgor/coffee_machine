package ru.project.coffeemachine.model;

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
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "drink")
    private String drink;

    @Column(name = "volume")
    private Long volume;

    @Column(name = "sugar")
    private Long sugar;

    public Machine() {
        super();
    }

    public Machine(String drink, Long volume, Long sugar, LocalDate date) {
        this.drink = drink;
        this.volume = volume;
        this.sugar = sugar;
        this.date = date;
    }

    @Override
    public String toString() {
        return "CoffeeMachine: { "  +
                "drink = " + drink + "\n" +
                ", volume = " + volume + "\n" +
                ", sugar = " + sugar + "\n" +
                ", date = " + date + "\n" +
                " } ";
    }
}
