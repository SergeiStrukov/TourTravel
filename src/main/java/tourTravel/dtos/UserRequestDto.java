package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class UserRequestDto {
    private String username;
    private String password;
    private String email;
    private Set<UUID> roleIds;
}
