package kata.academy.springboot.service;


import kata.academy.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(long id);

    void updateUser(User user, long id);

    void deleteUser(long id);
}
