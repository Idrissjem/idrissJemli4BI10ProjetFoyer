package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Chambre;
import esprit.tn.foyer_bi10.entity.Universite;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IUniversiteService {
    Universite addUniversite (Universite universite);

    void deleteUniversite (Long idUniversite);

    Universite UpdateUniversite ( Universite universite);

    List<Universite> getALLUniversite ();
}
