package com.cinesaragon.api.ApiCinesAragon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "sesiones")
public class Sesiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sesiones;
    @Column
    private int id_peliculas;
    @Column
    private int id_horarios;
}
