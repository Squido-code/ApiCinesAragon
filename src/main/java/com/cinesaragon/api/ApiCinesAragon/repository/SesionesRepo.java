package com.cinesaragon.api.ApiCinesAragon.repository;

import com.cinesaragon.api.ApiCinesAragon.domain.Sesiones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SesionesRepo extends CrudRepository<Sesiones, Integer> {
    @Query(value = "SELECT * FROM sesiones s LEFT JOIN horarios h on s.horarios=h.id WHERE s.peliculas = :param", nativeQuery = true)
    List<Sesiones> findByPeliculas(@Param("param") int param);
}
