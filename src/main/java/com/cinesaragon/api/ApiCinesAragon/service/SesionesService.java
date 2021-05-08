package com.cinesaragon.api.ApiCinesAragon.service;

import java.util.List;

public interface SesionesService {
    List<String> findByPeliculas(int idPelicula);
}
