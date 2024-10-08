package esprit.tn.foyer_bi10.repositories;

import esprit.tn.foyer_bi10.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository <Etudiant,Long> {

}
