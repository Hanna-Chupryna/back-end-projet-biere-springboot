package com.rc.biere.controller;

import com.rc.biere.dto.ArticleDto;
import com.rc.biere.dto.PaysDto;
import com.rc.biere.service.PaysService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<PaysDto> getPaysById(@PathVariable Integer id) {
        Optional<PaysDto> pays = paysService.getPaysById(id);
        return pays.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
    @GetMapping("/{NomPays}")
    public ResponseEntity<PaysDto> getPaysByNomPays(@PathVariable String NomPays) {
        Optional<PaysDto> pays = paysService.getPaysByNomPays(NomPays);
        return pays.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
     */

    @PostMapping("/add")
    public ResponseEntity<?> addPays(@RequestBody PaysDto paysDto) {
        PaysDto savedPays = paysService.addPays(paysDto);
        return ResponseEntity.ok(savedPays);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePays(@PathVariable Integer id) {
        paysService.deletePaysById(id);
        return ResponseEntity.ok("Pays supprimé avec succès.");
    }

}
