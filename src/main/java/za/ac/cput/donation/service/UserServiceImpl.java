package za.ac.cput.donation.service;

import org.springframework.stereotype.Service;
import za.ac.cput.donation.domain.User;
import za.ac.cput.donation.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User login(String email, String password) {
        Optional<User> user = repository.findByEmailAndPassword(email, password);
        return user.orElse(new User());
    }

    @Override
    public User findById(long id) {
        return repository.findById(id).orElse(new User());
    }
}
