package esprit.tn.foyer_bi10.services;


import esprit.tn.foyer_bi10.entity.Etudiant;
import esprit.tn.foyer_bi10.repositories.ChambreRepository;
import esprit.tn.foyer_bi10.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getALLEtudiant() {
        return etudiantRepository.findAll();
    }
}
