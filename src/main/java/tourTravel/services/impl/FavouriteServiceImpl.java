package tourTravel.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourTravel.dtos.FavouriteRequestDto;
import tourTravel.dtos.FavouriteResponseDto;
import tourTravel.entities.Favourite;
import tourTravel.mappers.FavouriteMapper;
import tourTravel.repositories.FavouriteRepository;
import tourTravel.services.FavouriteService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class FavouriteServiceImpl implements FavouriteService {

    @Autowired
    private FavouriteRepository favouriteRepository;

    @Autowired
    private FavouriteMapper favouriteMapper;

    @Override
    public FavouriteResponseDto addFavourite(FavouriteRequestDto favouriteRequestDto) {
        Favourite favourite = favouriteMapper.toEntity(favouriteRequestDto);
        Favourite savedFavourite = favouriteRepository.save(favourite);
        return favouriteMapper.toResponseDto(savedFavourite);
    }

    @Override
    public FavouriteResponseDto getFavouriteById(UUID id) {
        Favourite favourite = favouriteRepository.findById(id).orElse(null);
        return favourite != null ? favouriteMapper.toResponseDto(favourite) : null;
    }

    @Override
    public List<FavouriteResponseDto> getAllFavourites() {
        return favouriteRepository.findAll().stream()
                .map(favouriteMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public void removeFavourite(UUID id) {
        favouriteRepository.deleteById(id);
    }
}
