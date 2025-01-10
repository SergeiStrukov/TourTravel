package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FavouriteResponseDto {
    private UUID id;
    private UUID tourId;
    private UUID userId;
    private String tourName;
}
