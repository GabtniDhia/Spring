package com.example.kaddem.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Equipe")
public class Equipe {
    @Id
    private long id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    @ManyToMany(mappedBy = "equipes")
    private Set<Projet> projets;

}
