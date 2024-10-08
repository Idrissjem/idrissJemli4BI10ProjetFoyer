package esprit.tn.foyer_bi10.services;


import esprit.tn.foyer_bi10.entity.Bloc;
import esprit.tn.foyer_bi10.repositories.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{

    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getALLBloc(Bloc bloc) {
        return blocRepository.findAll();
    }
}
