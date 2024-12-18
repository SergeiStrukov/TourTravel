package tourTravel.entities;

import jakarta.persistence.*;
import tourTravel.entities.enums.RoleName;

import java.util.UUID;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private RoleName name;
}
