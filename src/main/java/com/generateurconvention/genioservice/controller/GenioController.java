package com.generateurconvention.genioservice.controller;

import com.generateurconvention.genioservice.dto.ConventionBinaireRes;
import com.generateurconvention.genioservice.dto.ConventionInputWSDTO;
import com.generateurconvention.genioservice.service.GenioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/genio")
public class GenioController {

    private final GenioService genioService;

    public GenioController(GenioService genioService) {
        this.genioService = genioService;
    }

    @PostMapping("/generer")
    public ResponseEntity<ConventionBinaireRes> genererConvention(@RequestBody ConventionInputWSDTO input) {
        ConventionBinaireRes response = genioService.genererConvention(input);
        return ResponseEntity.ok(response);
    }
}
