package esprit.tn.foyer_bi10.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt ;
    private String prenomEt ;
    private Long cin ;
    private String ecole ;
    private Date dateNaissance ;
    @ManyToMany(mappedBy="Reservation")
    Reservation  reservation;
}


