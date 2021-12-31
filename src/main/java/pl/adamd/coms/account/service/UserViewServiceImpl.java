package pl.adamd.coms.account.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.adamd.coms.account.dto.UserCreateRequest;
import pl.adamd.coms.account.dto.UserViewResponse;
import pl.adamd.coms.account.entity.User;
import pl.adamd.coms.account.enums.Position;
import pl.adamd.coms.account.enums.Role;
import pl.adamd.coms.account.mapper.UserMapper;

import java.util.List;

@Service
@AllArgsConstructor
class UserViewServiceImpl implements UserViewService {
    private final UserService userService;
    private final UserMapper userMapper;

    @Override
    public UserViewResponse createNewEmployee(final UserCreateRequest newEmployee) {

        User newUser = User.builder()
                .name(newEmployee.getName().trim())
                .surname(newEmployee.getSurname().trim())
                .dateOfBirth(newEmployee.getDateOfBirth())
                .dateOfEmployment(newEmployee.getDateOfEmployment())
                .position(newEmployee.getPosition())
                .formOfEmployment(newEmployee.getFormOfEmployment())
                .salary(newEmployee.getSalary())
                .active(true)
                .build();

        if (newEmployee.getPosition() == Position.MANAGER) {
            newUser.setRole(Role.ADMIN);
        } else {
            newUser.setRole(Role.USER);
        }

        userService.save(newUser);

        return userMapper.userEntityToUserDto(newUser);
    }

    @Override
    public List<UserViewResponse> getAll() {
       List<User> userList = userService.findAll();

       return userMapper.userEntityListToUserDtoList(userList);
    }
}
