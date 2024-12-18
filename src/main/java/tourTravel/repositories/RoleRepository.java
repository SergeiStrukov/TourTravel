package tourTravel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tourTravel.entities.Role;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID>  {

}
