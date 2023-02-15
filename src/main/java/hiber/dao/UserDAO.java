package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
    User getUserById(int id);
}
