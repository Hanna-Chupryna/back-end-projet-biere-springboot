package com.rc.biere.controller;

import com.rc.biere.dto.VendreDto;
import com.rc.biere.service.VendreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendre")

public class VendreController {

    private final VendreService vendreService;

    public VendreController(VendreService vendreService) {
        this.vendreService = vendreService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<VendreDto>> getAllVendre(){
        List<VendreDto> vendres = vendreService.getAllVendre();
        return ResponseEntity.ok(vendres);
    }
}
