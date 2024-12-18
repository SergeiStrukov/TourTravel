package tourTravel.services;

import tourTravel.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserService{
    User createUser(User user);
    User getUserById(UUID id);
    List<User> getAllUsers();
    User updateUser(UUID id, User user);
    void deleteUser(UUID id);
}
