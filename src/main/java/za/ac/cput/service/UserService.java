package za.ac.cput.service;

import za.ac.cput.domain.User;

import java.util.List;

public interface UserService extends IService<User, String>
{
    void deleteById(String id);

    List<User> findAll();
}
