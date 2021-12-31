package pl.adamd.coms.account.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.adamd.coms.account.repository.UserRepository;

@Service
@AllArgsConstructor
class UserServiceImpl implements UserService{
    public final UserRepository userRepository;
}
