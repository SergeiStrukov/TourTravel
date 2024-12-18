package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class TourRequestDto {
    private String name;
    private String description;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;
    private UUID guideId;
    private String destination;
    private Timestamp createdDate;
    private Timestamp updatedDate;
}
