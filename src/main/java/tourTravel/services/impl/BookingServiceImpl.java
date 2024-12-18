import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourTravel.dtos.BookingRequestDto;
import tourTravel.dtos.BookingResponseDto;
import tourTravel.entities.Booking;
import tourTravel.mappers.BookingMapper;
import tourTravel.repositories.BookingRepository;
import tourTravel.services.BookingService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public BookingResponseDto createBooking(BookingRequestDto bookingRequestDto) {
        Booking booking = bookingMapper.toEntity(bookingRequestDto);
        Booking savedBooking = bookingRepository.save(booking);
        return bookingMapper.toResponseDto(savedBooking);
    }

    @Override
    public BookingResponseDto getBookingById(UUID id) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        return bookingMapper.toResponseDto(booking);
    }

    @Override
    public List<BookingResponseDto> getAllBookings() {
        return bookingRepository.findAll().stream()
                .map(bookingMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookingResponseDto updateBooking(UUID id, BookingRequestDto bookingRequestDto) {
        Booking existingBooking = bookingRepository.findById(id).orElse(null);
        if (existingBooking != null) {
            bookingMapper.updateEntity(bookingRequestDto, existingBooking);
            Booking updatedBooking = bookingRepository.save(existingBooking);
            return bookingMapper.toResponseDto(updatedBooking);
        }
        return null;
    }

    @Override
    public void deleteBooking(UUID id) {
        bookingRepository.deleteById(id);
    }
}
