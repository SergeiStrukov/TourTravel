package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class BookingRequestDto {
    private UUID userId;
    private UUID tourId;
    private Timestamp bookingDate;
    private String status;
    private BigDecimal totalPrice;
}
