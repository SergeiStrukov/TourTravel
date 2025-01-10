package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tourTravel.entities.Favourite;

import java.util.UUID;

public interface FavouriteRepository extends JpaRepository<Favourite, UUID> {

}
