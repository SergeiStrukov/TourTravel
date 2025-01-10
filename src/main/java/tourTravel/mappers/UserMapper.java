package tourTravel.mappers;

import org.mapstruct.Mapper;
import tourTravel.dtos.UserRequestDto;
import tourTravel.dtos.UserResponseDto;
import tourTravel.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toResponseDto(User user);

    User toEntity(UserRequestDto userRequestDto);
}
