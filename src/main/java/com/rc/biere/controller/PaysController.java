package com.rc.biere.controller;

import com.rc.biere.dto.PaysDto;
import com.rc.biere.service.PaysService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/add")
    public ResponseEntity<?> addPays(@RequestBody PaysDto paysDto) {
        PaysDto savedPays = paysService.addPays(paysDto);
        return ResponseEntity.ok(savedPays);
    }


}
