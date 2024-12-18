package tourTravel.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tourTravel.dtos.UserRequestDto;
import tourTravel.dtos.UserResponseDto;
import tourTravel.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "getRoleResponseDtos", target = "roles")
    UserResponseDto toResponseDto(User user);

    @Mapping(source = "roleIds", target = "roles")
    User toEntity(UserRequestDto userRequestDto);
}
