package ru.project.coffeemachine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.project.coffeemachine.dto.CoffeeDto;
import ru.project.coffeemachine.model.Machine;
import ru.project.coffeemachine.service.MachineService;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/greeting")
public class MachineController {

    private final MachineService machineService;

    @GetMapping("/find-all")
    public List<CoffeeDto> findAll(Pageable pageable ) {
        return machineService.findAll(pageable);
    }

    @PostMapping("/save")
    public ResponseEntity<String> create(@RequestBody CoffeeDto dto) {
        return machineService.create(dto);
    }

    @GetMapping("/find-by-id")
    public Optional<Machine> findById(Long id) {
        return machineService.findById(id);
    }

    @DeleteMapping("/delete-by-id")
    public void deleteById(Long id) {
        machineService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CoffeeDto dto, Long id) {
        machineService.update(dto, id);
    }

}
