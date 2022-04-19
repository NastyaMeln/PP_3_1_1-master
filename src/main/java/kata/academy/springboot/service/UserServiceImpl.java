package kata.academy.springboot.service;

import kata.academy.springboot.model.User;
import kata.academy.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getAllUsers() {
        List<User> userList = userRepository.getAllUsers();
        return userList;
    }

    @Transactional
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Transactional
    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    @Transactional
    public void updateUser(User user, long id) {
        user.setId(id);
        userRepository.updateUser(user);
    }

    @Transactional
    public void deleteUser(long id) {
        userRepository.delete(id);
    }
}
