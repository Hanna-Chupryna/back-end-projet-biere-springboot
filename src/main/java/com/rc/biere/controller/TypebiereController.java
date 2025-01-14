package com.rc.biere.controller;

import com.rc.biere.dto.TypebiereDto;
import com.rc.biere.entity.Typebiere;
import com.rc.biere.service.TypebiereService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typebiere")

public class TypebiereController {

    private final TypebiereService typebiereService;

    public TypebiereController(TypebiereService typebiereService) {
        this.typebiereService = typebiereService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> obtenirToutesLesTypebieres() {
        List<TypebiereDto> listTypebiere = typebiereService.getAllTypebiere();
        return ResponseEntity.ok().body(listTypebiere);
    }
}
