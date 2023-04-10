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
@Table(name = "Projet")
public class Projet {
    @Id
    private long id;
    private String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "equipe_projet",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "equipe_id"))
    private Set<Equipe> equipes;

    // Constructeurs, getters, setters, etc.
}
