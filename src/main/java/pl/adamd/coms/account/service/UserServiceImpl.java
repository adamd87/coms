package pl.adamd.coms.account.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.adamd.coms.account.entity.User;
import pl.adamd.coms.account.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
class UserServiceImpl implements UserService{
    public final UserRepository userRepository;

    @Override
    public User save(final User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
