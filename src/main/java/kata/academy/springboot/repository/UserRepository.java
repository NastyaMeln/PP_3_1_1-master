package kata.academy.springboot.repository;


import kata.academy.springboot.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void updateUser(User user);

    void delete(long id);
}
