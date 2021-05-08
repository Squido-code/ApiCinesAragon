package com.cinesaragon.api.ApiCinesAragon.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_genero;
    @Column
    private String nombre;
    @OneToMany
    @JoinColumn(name = "id_genero")
    private List<Peliculas> peliculas;
}
