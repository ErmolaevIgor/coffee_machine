package ru.project.coffeemachine.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.project.coffeemachine.dto.CoffeeDto;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.repository.MachineRepo;
import ru.project.coffeemachine.util.MachineConverter;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MachineService {

    private final MachineRepo machineRepo;

    public List<CoffeeDto> findAll(Pageable pageable) {
        return machineRepo.findAll(pageable)
                .stream()
                .map(CoffeeDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public ResponseEntity<String> create(CoffeeDto dto) {
        machineRepo.save(MachineConverter.convertCoffeeToMachine(dto));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public CoffeeDto findById(Long id) {
        return machineRepo.findById(id)
                .map(CoffeeDto::new)
                .orElseThrow(
                        () -> new EntityNotFoundException(
                                String.format("Сущность класса %s с данным id (%s) не найдена!", Machine.class, id)
                        ));
    }

    @Transactional
    public void deleteById(Long id) {
        machineRepo.deleteById(id);
    }

    @Transactional
    public void update(CoffeeDto dto) {
        machineRepo.findById(dto.getId()).map(machine -> {
            machine.setCoffeeType(dto.getCoffeeType());
            machine.setDrink(dto.getDrink());
            machine.setVolume(dto.getVolume());
            machine.setSugar(dto.getSugar());
            machine.setDate(LocalDateTime.now());
            return machineRepo.save(machine);

        }).orElseGet(() -> machineRepo.save(MachineConverter.convertCoffeeToMachine(dto)));
    }
}
