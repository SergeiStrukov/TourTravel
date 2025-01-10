package tourTravel.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tourTravel.dtos.FavouriteRequestDto;
import tourTravel.dtos.FavouriteResponseDto;
import tourTravel.entities.Favourite;

@Mapper(componentModel = "spring")
public interface FavouriteMapper {

    @Mapping(source = "tour.id", target = "tourId")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "tour.name", target = "tourName") // Связывает name из Tour с tourName в DTO
    FavouriteResponseDto toResponseDto(Favourite favourite);

    @Mapping(source = "tourId", target = "tour.id")
    @Mapping(target = "addedDate", source = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    Favourite toEntity(FavouriteRequestDto favouriteRequestDto);

    void updateEntityFromDto(FavouriteRequestDto favouriteRequestDto, @MappingTarget Favourite favourite);
}
