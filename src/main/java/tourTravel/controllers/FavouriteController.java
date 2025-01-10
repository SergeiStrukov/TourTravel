package tourTravel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tourTravel.dtos.FavouriteRequestDto;
import tourTravel.dtos.FavouriteResponseDto;
import tourTravel.services.FavouriteService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/favourites")
public class FavouriteController {

    @Autowired
    private FavouriteService favouriteService;

    @PostMapping
    public ResponseEntity<FavouriteResponseDto> createFavourite(@RequestBody FavouriteRequestDto favouriteRequestDto) {
        FavouriteResponseDto favouriteResponseDto = favouriteService.addFavourite(favouriteRequestDto);
        return ResponseEntity.ok(favouriteResponseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FavouriteResponseDto> getFavouriteById(@PathVariable UUID id) {
        FavouriteResponseDto favouriteResponseDto = favouriteService.getFavouriteById(id);
        return favouriteResponseDto != null ? ResponseEntity.ok(favouriteResponseDto) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<FavouriteResponseDto>> getAllFavourites() {
        List<FavouriteResponseDto> favouriteResponseDtos = favouriteService.getAllFavourites();
        return ResponseEntity.ok(favouriteResponseDtos);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavourite(@PathVariable UUID id) {
        favouriteService.removeFavourite(id);
        return ResponseEntity.noContent().build();
    }
}

