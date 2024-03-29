package am.itspace.shoes_shoppe_store.service;


import am.itspace.shoes_shoppe_store.model.User;
import am.itspace.shoes_shoppe_store.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
       return userRepository.findAll();
    }

    public User saveUser(User user) {
       return userRepository.save(user);
    }
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
