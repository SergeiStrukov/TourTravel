package tourTravel.services;

import tourTravel.entities.Favorite;

import java.util.List;
import java.util.UUID;

public interface FavouriteService {
    Favorite createFavourite(Favorite favourite);
    Favorite getFavouriteById(UUID id);
    List<Favorite> getAllFavourites();
    Favorite updateFavourite(UUID id, Favorite favourite);
    void deleteFavourite(UUID id);
}
