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

    @PostMapping("/add")
    public ResponseEntity<?> addMarque(@RequestBody MarqueDto marqueDto) {
        MarqueDto savedMarque = marqueService.addMarque(marqueDto);
        return ResponseEntity.ok(savedMarque);
    }

}
