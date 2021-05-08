package com.cinesaragon.api.ApiCinesAragon.service;

import com.cinesaragon.api.ApiCinesAragon.domain.Sesiones;
import com.cinesaragon.api.ApiCinesAragon.repository.SesionesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesionesServiceImpl implements SesionesService {
    @Autowired
    private SesionesRepo sesionesRepo;

    @Override
    public List<Sesiones> findByPeliculas(int idPelicula) {
        return sesionesRepo.findByPeliculas(idPelicula);
    }
}
