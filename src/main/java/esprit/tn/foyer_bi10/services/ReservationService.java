package esprit.tn.foyer_bi10.services;


import esprit.tn.foyer_bi10.entity.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    @Override
    public Reservation addReservation(Reservation reservation) {
        return null;
    }

    @Override
    public void deleteReservation(Long idReservation) {

    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> getALLReservation() {
        return null;
    }
}
