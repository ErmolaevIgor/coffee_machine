package ru.project.coffeemachine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.repository.MachineRepo;

import java.util.List;

@Service
public class MachineService {

    MachineRepo machineRepo;

    @Autowired
    public MachineService(MachineRepo machineRepo) {
        this.machineRepo = machineRepo;
    }

    public Machine findById(Long id) {
        return machineRepo.getById(id);
    }

    public List<Machine> findAll() {
        return machineRepo.findAll();
    }

    public void saveChoice(Machine machine) {
        machineRepo.save(machine);
    }

    public void deleteById(Long id) {
        machineRepo.deleteById(id);
    }

}
