package tourTravel.services;

import tourTravel.dtos.RoleResponseDto;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    RoleResponseDto getRoleById(UUID id);
    List<RoleResponseDto> getAllRoles();
}
