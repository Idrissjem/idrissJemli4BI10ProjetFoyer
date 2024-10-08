package esprit.tn.foyer_bi10.services;

import esprit.tn.foyer_bi10.entity.Bloc;
import esprit.tn.foyer_bi10.entity.Reservation;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

//@FieldDefaults(level = AccessLevel.PUBLIC)
public interface IReservationService {
    Reservation addReservation (Reservation reservation);

    void deleteReservation (Long idReservation);

    Reservation UpdateReservation ( Reservation reservation);

    List<Reservation> getALLReservation ();
}
