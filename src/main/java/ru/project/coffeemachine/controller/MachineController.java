package ru.project.coffeemachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.service.MachineService;

import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class MachineController {

    private final MachineService machineService;

    @Autowired
    public MachineController(MachineService machineService) {
        this.machineService = machineService;
    }



    @GetMapping("/choice/drink={drink}/volume={volume}/sugar={sugar}")
    public String saveChoice (@PathVariable("drink") String drink,
                              @PathVariable("volume") Double volume,
                              @PathVariable("sugar") Long sugar) {
        return machineService.saveChoice(drink, volume, sugar);
    }

    @GetMapping("/show-id={id}")
    public Optional<Machine> findById(@PathVariable("id") Long id) {
        return machineService.findById(id);
    }

    @GetMapping("/show-all")
    public String findAll() {
        return machineService.findAll().toString();
    }

    @GetMapping("/delete-id={id}")
    public void deleteById(@PathVariable("id") Long id) {
        machineService.deleteById(id);
    }

}
