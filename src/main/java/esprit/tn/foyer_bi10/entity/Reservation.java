package esprit.tn.foyer_bi10.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation       {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private  Date anneUniversitaire;
    private Boolean estValid;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> EtudiantList;

}
