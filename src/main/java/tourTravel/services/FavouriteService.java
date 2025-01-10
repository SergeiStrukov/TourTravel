package tourTravel.services;

import tourTravel.dtos.FavouriteRequestDto;
import tourTravel.dtos.FavouriteResponseDto;

import java.util.List;
import java.util.UUID;

public interface FavouriteService {
    FavouriteResponseDto addFavourite(FavouriteRequestDto favouriteRequestDto);
    FavouriteResponseDto getFavouriteById(UUID id);
    List<FavouriteResponseDto> getAllFavourites();
    void removeFavourite(UUID id);
}
