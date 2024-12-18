package tourTravel.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tourTravel.dtos.TourRequestDto;
import tourTravel.dtos.TourResponseDto;
import tourTravel.entities.Tour;

@Mapper(componentModel = "spring")
public interface TourMapper {

    @Mapping(source = "guide.id", target = "guideId")
    TourResponseDto toResponseDto(Tour tour);

    @Mapping(source = "guideId", target = "guide.id")
    Tour toEntity(TourRequestDto tourRequestDto);
}
