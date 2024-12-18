package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tourTravel.entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
