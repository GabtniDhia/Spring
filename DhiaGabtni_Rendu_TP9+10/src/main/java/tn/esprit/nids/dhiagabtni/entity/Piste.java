package tn.esprit.nids.dhiagabtni.entity;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")
    private Integer idPiste;
    private long    numPiste;
    private String  nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> Skieurs;

    public Couleur getCouleur() {
        return couleur;
    }
}
