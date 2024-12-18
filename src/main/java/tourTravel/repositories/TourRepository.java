package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tourTravel.entities.Tour;

import java.util.UUID;

public interface TourRepository extends JpaRepository<Tour, UUID> {

}
