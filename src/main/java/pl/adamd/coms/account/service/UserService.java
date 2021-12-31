package pl.adamd.coms.account.service;

import pl.adamd.coms.account.entity.User;

import java.util.List;

interface UserService {
    User save(User user);

    List<User> findAll();
}
