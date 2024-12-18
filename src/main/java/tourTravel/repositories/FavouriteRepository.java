package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FavouriteRepository extends JpaRepository<FavouriteRepository, UUID> {

}
