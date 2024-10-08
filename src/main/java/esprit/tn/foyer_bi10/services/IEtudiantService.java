package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Chambre;
import esprit.tn.foyer_bi10.entity.Etudiant;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)

public interface IEtudiantService {
    Etudiant addEtudiant (Etudiant etudiant);

    void deleteEtudiant (Long idEtudiant);

    Etudiant UpdateEtudiant ( Etudiant etudiant);

    List<Etudiant> getALLEtudiant ();
}
