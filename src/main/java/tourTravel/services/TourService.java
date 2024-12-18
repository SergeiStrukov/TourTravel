package tourTravel.services;

import tourTravel.entities.Tour;

import java.util.List;
import java.util.UUID;

public interface TourService {
    Tour createTour(Tour tour);
    Tour getTourById(UUID id);
    List<Tour> getAllTours();
    Tour updateTour(UUID id, Tour tour);
    void deleteTour(UUID id);
}
