package ru.project.coffeemachine.util;

import lombok.experimental.UtilityClass;
import ru.project.coffeemachine.dto.CoffeeDto;
import ru.project.coffeemachine.model.Machine;

import java.time.LocalDateTime;

@UtilityClass
public final class MachineConverter {

    public static Machine convertCoffeeToMachine(CoffeeDto dto) {
        Machine machine = new Machine();
        machine.setCoffeeType(dto.getCoffeeType());
        machine.setDate(LocalDateTime.now());
        machine.setDrink(dto.getDrink());
        machine.setVolume(dto.getVolume());
        machine.setSugar(dto.getSugar());
        return machine;
    }
}
