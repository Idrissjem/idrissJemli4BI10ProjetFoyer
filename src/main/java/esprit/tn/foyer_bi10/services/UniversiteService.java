package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    @Override
    public Universite addUniversite(Universite universite) {
        return null;
    }

    @Override
    public void deleteUniversite(Long idUniversite) {

    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return null;
    }

    @Override
    public List<Universite> getALLUniversite() {
        return null;
    }
}
