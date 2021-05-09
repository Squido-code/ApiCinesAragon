package com.cinesaragon.api.ApiCinesAragon.service;

import com.cinesaragon.api.ApiCinesAragon.domain.Peliculas;
import com.cinesaragon.api.ApiCinesAragon.repository.PeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepo peliculaRepo;

    @Override
    public List<Peliculas> findAll() {
        return peliculaRepo.findAll();
    }

    @Override
    public Peliculas findById(int id) {
        return peliculaRepo.findById(id);
    }

    @Override
    public List<Peliculas> findByGenero(int id) {
        return peliculaRepo.findByGenero(id);
    }

    @Override
    public Peliculas busquedaTitulo(String param) {
        return peliculaRepo.findByTituloContaining(param);
    }

    @Override
    public List<Peliculas> votoOrden() {
        return peliculaRepo.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Peliculas::getVotos).reversed())
                .collect(Collectors.toList());

    }

    @Override
    public List<String> findSesiones(int idPelicula) {
        return peliculaRepo.findSesiones(idPelicula);
    }
}
