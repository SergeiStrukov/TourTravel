package tourTravel.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import tourTravel.dtos.RoleRequestDto;
import tourTravel.dtos.RoleResponseDto;
import tourTravel.entities.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    Role toEntity(RoleRequestDto roleRequestDto);

    RoleResponseDto toResponseDto(Role role);

    void updateEntity(RoleRequestDto roleRequestDto, @MappingTarget Role role);
}
