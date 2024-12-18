package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tourTravel.entities.Booking;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {

}
