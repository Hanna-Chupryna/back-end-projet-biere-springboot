package com.rc.biere.controller;

import com.rc.biere.dto.FabricantDto;
import com.rc.biere.entity.Fabricant;
import com.rc.biere.service.FabricantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fabricant")

public class FabricantController {

    private final FabricantService fabricantService;

    public FabricantController(FabricantService fabricantService) {
        this.fabricantService = fabricantService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> obtenirToutsLesFabricants() {
        List<FabricantDto> listFabricant = fabricantService.getAllFabricant();
        return ResponseEntity.ok(listFabricant);
    }
}
