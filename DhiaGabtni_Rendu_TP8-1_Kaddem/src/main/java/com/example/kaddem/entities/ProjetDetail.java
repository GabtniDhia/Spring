package com.example.kaddem.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ProjetDetail")
public class ProjetDetail {
    @Id
    private long id;
    private String description;
    private String technologie;
    private long cout;
    private LocalDate dateDebut;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projet_id")
    private Projet projet;
}
