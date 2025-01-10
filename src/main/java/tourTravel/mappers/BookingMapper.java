package tourTravel.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import tourTravel.dtos.BookingRequestDto;
import tourTravel.dtos.BookingResponseDto;
import tourTravel.entities.Booking;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "tour.id", target = "tourId")
    BookingResponseDto toResponseDto(Booking booking);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "tourId", target = "tour.id")
    Booking toEntity(BookingRequestDto bookingRequestDto);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "tourId", target = "tour.id")
    void toEntity(BookingRequestDto bookingRequestDto, @MappingTarget Booking existingBooking);
}
