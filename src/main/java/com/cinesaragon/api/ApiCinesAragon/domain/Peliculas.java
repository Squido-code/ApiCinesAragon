package com.cinesaragon.api.ApiCinesAragon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pelicula;

    @Column
    private String titulo;

    @Column
    private String fecha_estreno;

    @Column
    private int duracion;

    @Column
    private String precio;

    @Column
    private String cartel;

    @Column
    private int votos;

    @Column
    private int id_genero;

    @OneToMany
    @JoinColumn(name = "id_peliculas")
    private List<Sesiones> sesiones;
}
