package com.cinesaragon.api.ApiCinesAragon.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "horarios")
public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_horarios;
    @Column
    private String hora;
    @OneToMany
    @JoinColumn(name = "id_horarios")
    private List<Sesiones> sesiones;
}
