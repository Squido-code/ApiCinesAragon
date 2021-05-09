package com.cinesaragon.api.ApiCinesAragon.repository;

import com.cinesaragon.api.ApiCinesAragon.domain.Peliculas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepo extends CrudRepository<Peliculas, Integer> {

    List<Peliculas> findAll();

    Peliculas findById(int id);

    List<Peliculas> findByGenero(int id);

    Peliculas findByTituloContaining(String titulo);

    @Query(value = "SELECT hora FROM horarios h " +
            "LEFT JOIN peliculas_horarios p on h.id=p.horarios_id " +
            "WHERE p.peliculas_id = :param", nativeQuery = true)
    List<String> findSesiones(@Param("param") int param);
}
