package com.cinesaragon.api.ApiCinesAragon.controller;

import com.cinesaragon.api.ApiCinesAragon.domain.Peliculas;
import com.cinesaragon.api.ApiCinesAragon.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeliculasController {
    @Autowired
    private PeliculaService peliculaService;


    @GetMapping("peliculas")
    public ResponseEntity<List<Peliculas>> getPeliculas() {
        List<Peliculas> peliculas = peliculaService.findAll();
        return new ResponseEntity<>(peliculas, HttpStatus.OK);
    }

    @GetMapping("peliculas/{id}")
    public ResponseEntity<Peliculas> getPelicula(@PathVariable int id) {
        Peliculas pelicula = peliculaService.findById(id);
        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }

    @GetMapping("genero/{id}")
    public ResponseEntity<List<Peliculas>> getPeliculasPorGenero(@PathVariable int id) {
        List<Peliculas> peliculas = peliculaService.findByGenero(id);
        return new ResponseEntity<>(peliculas, HttpStatus.OK);
    }

    @GetMapping("pelicula")
    public ResponseEntity<Peliculas> getPeliculaTitulo(@RequestParam String titulo) {
        Peliculas pelicula = peliculaService.busquedaTitulo(titulo);
        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }

    @GetMapping("orden")
    public ResponseEntity<List<Peliculas>> getPeliculaPorVotos() {
        List<Peliculas> peliculas = peliculaService.votoOrden();
        return new ResponseEntity<>(peliculas, HttpStatus.OK);
    }

    @GetMapping("sesiones/{id}")
    public ResponseEntity<List<String>> getSesiones(@PathVariable int id) {
        List<String> sesiones = peliculaService.findSesiones(id);
        return new ResponseEntity<>(sesiones, HttpStatus.OK);
    }
}
