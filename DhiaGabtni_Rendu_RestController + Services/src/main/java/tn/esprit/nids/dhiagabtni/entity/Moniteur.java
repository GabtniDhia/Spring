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
@Table(name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMoniteur")
    private long idMoniteur;
    private int  niveau;
    private String  nomM;
    private String  prenomM;
    private LocalDate dateRecru;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> Cours;

}


