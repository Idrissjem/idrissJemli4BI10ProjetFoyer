package esprit.tn.foyer_bi10.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING) //string khater chaine de caractaire et ordinal chiffre fel base 0,1,2 w fel base tabda tehseb mel 0 maneha simple 0 et double 1 et triple 2
    private TypeChambre typeC;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Bloc> Bloc;
}
