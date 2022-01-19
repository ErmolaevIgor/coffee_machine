package ru.project.coffee_machine.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.project.coffee_machine.model.Machine;
import ru.project.coffee_machine.repository.MachineRepo;

import java.time.LocalDate;

@AllArgsConstructor
@RestController
@RequestMapping("/greeting")
public class MachineController {

    private MachineRepo machineRepo;

    @RequestMapping(value = "/choice/{drink}/{volume}/{sugar}", method = RequestMethod.GET)
    public String choice (@PathVariable("drink") String drink,
                          @PathVariable("volume") long volume,
                          @PathVariable("sugar") long sugar)
    {
        Machine machine = new Machine();
        machine.setTime(LocalDate.now());
        machine.setDrink(drink);
        machine.setVolume(volume);
        machine.setSugar(sugar);
        machineRepo.save(machine);
        return "приятного аппетита!";
    }

}
