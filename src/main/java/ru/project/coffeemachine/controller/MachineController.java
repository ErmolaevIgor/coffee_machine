package ru.project.coffeemachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.service.MachineService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@RestController
@RequestMapping("/greeting")
public class MachineController {

    private final MachineService machineService;

    @Autowired
    public MachineController(MachineService machineService) {
        this.machineService = machineService;
    }

    @GetMapping("/show_coffee_choice")
    public String findAll() {
        return machineService.findAll().toString();
    }

    @GetMapping("/choice/{drink}/{volume}/{sugar}")
    public String saveChoice (@PathVariable("drink") String drink,
                              @PathVariable("volume") Long volume,
                              @PathVariable("sugar") Long sugar)
    {
        Machine machine = new Machine(drink, volume, sugar, LocalDate.now());
        machineService.saveChoice(machine);
        return "redirect:http://localhost:8080/greeting/show_coffee_choice";
    }

}
