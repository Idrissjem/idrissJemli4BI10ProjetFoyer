package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Bloc;
import esprit.tn.foyer_bi10.entity.Foyer;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;


//@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IFoyerService {
    Foyer addBloc(Foyer foyer);

    void deleteFoyer(Long idFoyer);

    Foyer UpdateFoyer(Foyer foyer);

    List<Foyer> getALLFoyer();
}