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
@Table(name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCours")
    private Long idCours;
    private Integer  niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float   prix;
    private Integer     creneau;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Inscription> Inscriptions;


}

