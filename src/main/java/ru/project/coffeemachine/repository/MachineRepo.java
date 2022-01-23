package ru.project.coffeemachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.coffeemachine.model.Machine;

@Repository
public interface MachineRepo extends JpaRepository<Machine, Long> {
}
