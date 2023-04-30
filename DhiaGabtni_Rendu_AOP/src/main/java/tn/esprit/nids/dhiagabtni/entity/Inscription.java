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
@Table(name = "Inscription")
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSInscription")
    private long idInscription;
    private int numSemaine;


    @ManyToOne
    Skieur skieur;

    @ManyToOne
    Cours cours;

    public Inscription setSkieur(Skieur skieur) {
        this.skieur = skieur;
        return this;
    }
}

