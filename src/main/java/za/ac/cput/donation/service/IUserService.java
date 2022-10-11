package za.ac.cput.donation.service;

import za.ac.cput.donation.domain.User;

public interface IUserService {
    User login(String email, String password);
    User findById(long id);
}
