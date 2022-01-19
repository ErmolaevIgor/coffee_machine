package ru.project.coffee_machine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.coffee_machine.model.Machine;

public interface MachineRepo extends JpaRepository<Machine, Long> {
}
