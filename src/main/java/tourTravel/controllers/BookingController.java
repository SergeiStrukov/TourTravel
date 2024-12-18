import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tourTravel.dtos.BookingResponseDto;
import tourTravel.entities.Booking;
import tourTravel.mappers.BookingMapper;
import tourTravel.repositories.BookingRepository;
import tourTravel.services.BookingService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookingController implements BookingService {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<>

}
