package esprit.tn.foyer_bi10.repositories;

import esprit.tn.foyer_bi10.entity.Bloc;
import esprit.tn.foyer_bi10.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
