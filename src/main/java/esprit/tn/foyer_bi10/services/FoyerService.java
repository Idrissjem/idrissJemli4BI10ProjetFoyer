package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Foyer;
import esprit.tn.foyer_bi10.repositories.EtudiantRepository;
import esprit.tn.foyer_bi10.repositories.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    FoyerRepository foyerRepository;

    @Override
    public Foyer addBloc(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer UpdateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getALLFoyer() {
        return foyerRepository.findAll();
    }
}
