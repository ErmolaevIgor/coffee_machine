package ru.project.coffeemachine.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.project.coffeemachine.dto.CoffeeDto;
import ru.project.coffeemachine.repository.MachineRepo;
import ru.project.coffeemachine.util.MachineConverter;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MachineService {

    private  final MachineRepo machineRepo;

    public List<CoffeeDto> findAll(Pageable pageable) {
        return machineRepo.findAll(pageable)
                .stream()
                .map(CoffeeDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public ResponseEntity<String> save(CoffeeDto dto) {
        machineRepo.save(MachineConverter.convertCoffeeToMachine(dto));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
