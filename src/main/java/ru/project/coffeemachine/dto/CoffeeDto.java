package ru.project.coffeemachine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.project.coffeemachine.enums.CoffeeType;
import ru.project.coffeemachine.model.Machine;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeDto {
    private CoffeeType coffeeType;
    private String drink;
    private Long volume;
    private Long sugar;
    private LocalDateTime dateTime;

    public CoffeeDto(Machine machine) {
        this.coffeeType = machine.getCoffeeType();
        this.drink = machine.getDrink();
        this.sugar = machine.getSugar();
        this.volume = machine.getVolume();
        this.dateTime = machine.getDate();

    }
}
