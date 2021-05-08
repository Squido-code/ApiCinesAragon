package com.cinesaragon.api.ApiCinesAragon.service;

import com.cinesaragon.api.ApiCinesAragon.domain.Sesiones;

import java.util.List;

public interface SesionesService {
    List<Sesiones> findByPeliculas(int idPelicula);
}
