package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;
import tourTravel.entities.Role;


import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class UserResponseDto {
    private UUID id;
    private String username;
    private String email;
    private Set<Role> roleResponseDtos;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}