package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class RoleResponseDto {
    private UUID id;
    private String name;

}
