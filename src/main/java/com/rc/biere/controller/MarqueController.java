package com.rc.biere.controller;

import com.rc.biere.dto.MarqueDto;
import com.rc.biere.service.MarqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marque")

public class MarqueController {

    private final MarqueService marqueService;

    public MarqueController(MarqueService marqueService) {
        this.marqueService = marqueService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MarqueDto>> getAllMarques() {
        List<MarqueDto> marques = marqueService.getAllMarques();
        return ResponseEntity.ok(marques);
    }

    // Получение записи по ID
    @GetMapping("/{id}")
    public ResponseEntity<MarqueDto> getMarqueById(@PathVariable Integer id) {
        MarqueDto marque = marqueService.getMarqueById(id);
        return ResponseEntity.ok(marque);
    }

    // Создание новой записи
    @PostMapping("/create")
    public ResponseEntity<MarqueDto> createMarque(@RequestBody MarqueDto marqueDto) {
        MarqueDto createdMarque = marqueService.createMarque(marqueDto);
        return ResponseEntity.ok(createdMarque);
    }

    // Обновление записи
    @PutMapping("/update/{id}")
    public ResponseEntity<MarqueDto> updateMarque(
            @PathVariable Integer id,
            @RequestBody MarqueDto marqueDto
    ) {
        MarqueDto updatedMarque = marqueService.updateMarque(id, marqueDto);
        return ResponseEntity.ok(updatedMarque);
    }

    // Удаление записи
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMarque(@PathVariable Integer id) {
        marqueService.deleteMarque(id);
        return ResponseEntity.noContent().build();
    }

}
