package ru.project.coffeemachine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.coffeemachine.enums.CoffeeType;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.repository.MachineRepo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MachineService {

    MachineRepo machineRepo;

    @Autowired
    public MachineService(MachineRepo machineRepo) {
        this.machineRepo = machineRepo;
    }

    public Optional<Machine> findById(Long id) {
        return machineRepo.findById(id);
    }

    public List<Machine> findAll() {
        return machineRepo.findAll();
    }

    public String saveChoice(String drink, Double volume, Long sugar) {
        Machine machine = new Machine(drink, volume, sugar, LocalDate.now());
        machineRepo.save(machine);
        return "Вы заказали " + machine.getDrink() + ". Ожидайте!\n Приятного аппетита!";
    }

    public void deleteById(Long id) {
        machineRepo.deleteById(id);
    }

}
