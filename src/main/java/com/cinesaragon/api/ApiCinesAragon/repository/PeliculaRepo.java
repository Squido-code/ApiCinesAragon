package com.cinesaragon.api.ApiCinesAragon.repository;

import com.cinesaragon.api.ApiCinesAragon.domain.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepo extends CrudRepository<Peliculas, Integer> {

    List<Peliculas> findAll();

    Peliculas findById(int id);

    List<Peliculas> findByGenero(int id);

    Peliculas findByTituloContaining(String titulo);


}
