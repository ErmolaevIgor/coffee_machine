package ru.project.coffeemachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.coffeemachine.model.Machine;

public interface MachineRepo extends JpaRepository<Machine, Long> {
}
