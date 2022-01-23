package ru.project.coffeemachine.model;

import lombok.*;
import ru.project.coffeemachine.enums.CoffeeType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "machine", schema = "coffee_machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "drink")
    private String drink;

    @Column(name = "volume")
    private Long volume;

    @Column(name = "sugar")
    private Long sugar;

    @Column(name = "coffee_type")
    @Enumerated(EnumType.STRING)
    private CoffeeType coffeeType;

}
