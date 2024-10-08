package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Chambre;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IChambreService {

    Chambre addChambre (Chambre chambre);

     void deleteChambre (Long idChambre);

     Chambre UpdateChambre ( Chambre chambre);

     List<Chambre> getALLChambre ();
}
