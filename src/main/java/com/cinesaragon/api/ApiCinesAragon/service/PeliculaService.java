package com.cinesaragon.api.ApiCinesAragon.service;

import com.cinesaragon.api.ApiCinesAragon.domain.Peliculas;

import java.util.List;

public interface PeliculaService {
    List<Peliculas> findAll();

    Peliculas findById(int id);

    List<Peliculas> findByGenero(int id);

    Peliculas busquedaTitulo(String param);

    List<Peliculas> votoOrden();

    List<String> findSesiones(int idPelicula);

}
