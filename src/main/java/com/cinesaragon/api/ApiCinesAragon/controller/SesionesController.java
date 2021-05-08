package com.cinesaragon.api.ApiCinesAragon.controller;

import com.cinesaragon.api.ApiCinesAragon.service.SesionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SesionesController {
    @Autowired
    private SesionesService sesionesService;

    @GetMapping("sesiones/{id}")
    public ResponseEntity<List<String>> getSesiones(@PathVariable int id) {
        List<String> sesiones = sesionesService.findByPeliculas(id);
        return new ResponseEntity<>(sesiones, HttpStatus.OK);
    }
}
