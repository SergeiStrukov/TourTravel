package tourTravel.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FavouriteRequestDto {
    private UUID tourId;
}
