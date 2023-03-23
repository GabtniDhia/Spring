package tn.esprit.nids.dhiagabtni.entity;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkieur")
    private long idSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> Pistes;

    @OneToOne
    private Abonnement Abon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skieur")
    private Set<Inscription> Inscriptions;

}
