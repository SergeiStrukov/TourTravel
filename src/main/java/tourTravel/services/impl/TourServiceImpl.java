package tourTravel.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourTravel.entities.Tour;
import tourTravel.repositories.TourRepository;
import tourTravel.services.TourService;

import java.util.List;
import java.util.UUID;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;

    @Override
    public Tour createTour(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public Tour getTourById(UUID id) {
        return tourRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Tour updateTour(UUID id, Tour tour) {
        Tour existingTour = tourRepository.findById(id).orElse(null);
        if (existingTour != null) {
            // Update fields here
            return tourRepository.save(existingTour);
        }
        return null;
    }

    @Override
    public void deleteTour(UUID id) {
        tourRepository.deleteById(id);
    }
}
