package tourTravel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tourTravel.entities.Favorite;
import tourTravel.services.FavouriteService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {

    @Autowired
    private FavouriteService favouriteService;

    @PostMapping
    public ResponseEntity<Favorite> createFavourite(@RequestBody Favorite favourite) {
        return ResponseEntity.ok(favouriteService.createFavourite(favourite));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favorite> getFavouriteById(@PathVariable UUID id) {
        return ResponseEntity.ok(favouriteService.getFavouriteById(id));
    }

    @GetMapping
    public ResponseEntity<List<Favorite>> getAllFavourites() {
        return ResponseEntity.ok(favouriteService.getAllFavourites());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Favorite> updateFavourite(@PathVariable UUID id, @RequestBody Favorite favourite) {
        return ResponseEntity.ok(favouriteService.updateFavourite(id, favourite));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavourite(@PathVariable UUID id) {
        favouriteService.deleteFavourite(id);
        return ResponseEntity.noContent().build();
    }
}
