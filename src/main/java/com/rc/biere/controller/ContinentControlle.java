package com.rc.biere.controller;

import com.rc.biere.dto.ContinentDto;
import com.rc.biere.service.ContinentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/continent")

public class ContinentControlle {
    private final ContinentService continentService;

    public ContinentControlle(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> obtenirToutesLesContinentes() {
        List<ContinentDto> listContinent = continentService.getAllContinents();
        return ResponseEntity.ok(listContinent);
    }
}
