package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import java.sql.Timestamp;

@Getter
@Setter
public class TourResponseDto {
    private UUID id;
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