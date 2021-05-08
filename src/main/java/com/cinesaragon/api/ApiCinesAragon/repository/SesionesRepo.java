package com.cinesaragon.api.ApiCinesAragon.repository;

import com.cinesaragon.api.ApiCinesAragon.domain.Sesiones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SesionesRepo extends CrudRepository<Sesiones, Integer> {
    @Query(value = "SELECT hora FROM horarios h LEFT JOIN peliculas_horarios p on h.id=p.horarios_id WHERE p.peliculas_id = :param", nativeQuery = true)
    List<String> findByPeliculas(@Param("param") int param);
}
