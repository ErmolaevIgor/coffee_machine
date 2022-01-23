package ru.project.coffeemachine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.project.coffeemachine.dto.CoffeeDto;
import ru.project.coffeemachine.service.MachineService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/greeting")
public class MachineController {

    private final MachineService machineService;

    @GetMapping("/show-all")
    public List<CoffeeDto> findAll(Pageable pageable ) {
        return machineService.findAll(pageable);
    }

    @PostMapping("/choice")
    public ResponseEntity<String> save(@RequestBody CoffeeDto dto) {
        return machineService.save(dto);
    }

}
