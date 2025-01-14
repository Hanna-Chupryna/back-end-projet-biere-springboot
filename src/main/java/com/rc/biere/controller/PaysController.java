package com.rc.biere.controller;

import com.rc.biere.dto.PaysDto;
import com.rc.biere.service.PaysService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pays")

public class PaysController {
    private final PaysService paysService;

    public PaysController(PaysService paysService) {
        this.paysService = paysService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllPays() {
        List<PaysDto> listPays = paysService.getAllPays();
        return ResponseEntity.ok(listPays);
    }

    @GetMapping("/continent/{continentId}")
    public ResponseEntity<?> getPaysByContinent(@PathVariable Integer continentId) {
        List<PaysDto> listPays = paysService.getPaysByContinentId(continentId);
        return ResponseEntity.ok(listPays);
    }


}
