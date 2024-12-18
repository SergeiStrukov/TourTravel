package tourTravel.services;

import tourTravel.dtos.BookingRequestDto;
import tourTravel.dtos.BookingResponseDto;

import java.util.List;
import java.util.UUID;

public interface BookingService {
    BookingResponseDto createBooking(BookingRequestDto bookingRequestDto);
    BookingResponseDto getBookingById(UUID id);
    List<BookingResponseDto> getAllBookings();
    BookingResponseDto updateBooking(UUID id, BookingRequestDto bookingRequestDto);
    void deleteBooking(UUID id);
}
