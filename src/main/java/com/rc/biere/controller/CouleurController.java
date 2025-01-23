package com.rc.biere.controller;

import com.rc.biere.dto.CouleurDto;
import com.rc.biere.service.CouleurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/couleur")

public class CouleurController {
    private final CouleurService couleurService;

    public CouleurController(CouleurService couleurService) {

        this.couleurService = couleurService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> obtenirToutesLesCouleurs(){
        List<CouleurDto> listCouleur = couleurService.getAllCouleurs();
        return ResponseEntity.ok(listCouleur);
    }
}
